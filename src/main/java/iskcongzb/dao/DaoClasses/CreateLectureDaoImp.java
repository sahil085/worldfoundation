package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.CreateLectureDao;

import iskcongzb.dao.DaoInterfaces.LectureOperations;
import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CreateLectureDaoImp implements CreateLectureDao {
    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    LectureOperations lectureOperations;
    public boolean createLecture(CreateLecture lecture, User user) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            lecture.setActive(true);
            lecture.setLive(false);
            lecture.setCreatedBy(user);
            lecture.setCreateCourse(lectureOperations.getCourseForLecture(lecture.getCourseName()));
            lecture.setLastUpdate(lecture.getDate());
            lecture.setLastUpdateionTime(new Date());
            session.save(lecture);
            session.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            session.getTransaction().rollback();
            System.out.println("error in lecture creation "+e);
            return false;
        }finally {
            session.close();
        }

    }

}
