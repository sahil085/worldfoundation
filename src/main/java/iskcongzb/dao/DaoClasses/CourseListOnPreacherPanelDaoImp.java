package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.CourseListOnPreacherPanel;
import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.CreateLecture;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseListOnPreacherPanelDaoImp  implements CourseListOnPreacherPanel{
    @Autowired
    SessionFactory sessionFactory;

    public List<CreateCourse> getCourseList(String uname) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from CreateCourse where CreatedBy.userName =:uname";
            Query query=session.createQuery(q);
            query.setParameter("uname",uname);
            return query.list();

        }catch (Exception e)
        {
            System.out.println("error in list of courses "+e);
            return null;

        }finally {
            session.close();
        }
    }

    public Long getNumberOfStudents(int id) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="select count(*) from AttendanceRecord where lecture.id=:lid and status=:s";
            Query query=session.createQuery(q);
            query.setParameter("lid",id);
            query.setParameter("s","present");
            return (Long) query.uniqueResult();

        }catch (Exception e)
        {
            System.out.println("error in list of courses "+e);
            return Long.valueOf(0);

        }finally {
            session.close();
        }
    }

    public List<CreateCourse> getCourseDetailsByName(String cname) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from CreateCourse where CourseName=:cname";
            Query query=session.createQuery(q);
            query.setParameter("cname",cname);
            return  query.list();

        }catch (Exception e)
        {
            System.out.println("error in list of courses to fetch one course "+e);
            return null;

        }finally {
            session.close();
        }
    }
}
