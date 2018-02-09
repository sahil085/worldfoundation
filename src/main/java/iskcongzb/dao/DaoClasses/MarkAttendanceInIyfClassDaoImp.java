package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.MarkAttendanceInIyfClassDao;
import iskcongzb.domain.AttendanceRecord;
import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MarkAttendanceInIyfClassDaoImp implements MarkAttendanceInIyfClassDao{
    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    AttendanceRecord attendanceRecord;

    public String markUserAsPresent(CreateLecture lecture, User user) {
        Session session=sessionFactory.openSession();
        try
        {
            if(!alreadyMarkedAsPresent(lecture,user)) {
                session.beginTransaction();
                attendanceRecord.setLecture(lecture);
                attendanceRecord.setUser(user);
                attendanceRecord.setStatus("present");
                session.saveOrUpdate(attendanceRecord);
                session.getTransaction().commit();
                return "Your Are Marked As present For " + lecture.getTittle() + " Lecture ";
            }else {
                return "You Are Already Marked As Present For This Lecture";
            }
        }catch (Exception e)
        {
            System.out.println("error in mark attendace "+e);
            return "Your Are marked As Absent Due To Some Technical error Please Contact "+lecture.getSpeakerName();
        }finally {
            session.close();
        }
    }

    public String markUserAsAbsent(CreateLecture lecture, User user) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            attendanceRecord.setLecture(lecture);
            attendanceRecord.setUser(user);
            attendanceRecord.setStatus("Absent");
            session.saveOrUpdate(attendanceRecord);
            session.getTransaction().commit();
            return "Your Are Marked As Absent For "+lecture.getTittle()+" Lecture ";
        }catch (Exception e)
        {
            System.out.println("error in mark attendace "+e);
            return "Your Are marked As Absent Due To Some Technical error Please Contact "+lecture.getSpeakerName();
        }finally {
            session.close();
        }
    }

    public boolean alreadyMarkedAsPresent(CreateLecture lecture,User user)
    {
        Session session=sessionFactory.openSession();
        try
        {
         String q="SELECT status from AttendanceRecord where user=:u and lecture=:lec";
            Query query=session.createQuery(q);
            query.setParameter("u",user).setParameter("lec",lecture);
            List<AttendanceRecord> list=query.list();
            if(list.contains("present"))
            {
                return true;
            }else {
                return false;
            }
        }catch (Exception e)
        {
            System.out.println("error in mark attendace "+e);
            return false;
        }finally {
            session.close();
        }

    }
}
