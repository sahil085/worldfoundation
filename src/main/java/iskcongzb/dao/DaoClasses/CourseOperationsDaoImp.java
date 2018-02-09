package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.CourseOperations;
import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class CourseOperationsDaoImp implements CourseOperations {
    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    CreateCourse createCourse;

    public String updateCourseinfo(CreateCourse createCourse) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
           CreateCourse course= (CreateCourse) session.get(CreateCourse.class,createCourse.getId());

           course.setLastUpdationDate(new Date());
           course.setCourseCategory(createCourse.getCourseCategory());
           course.setCourseDescription(createCourse.getCourseDescription());
           course.setCourseName(createCourse.getCourseName());
           session.saveOrUpdate(course);
            session.getTransaction().commit();


            return "Details Updated Successfully";

        }catch (Exception e)
        {
            System.out.println("error in list of courses "+e);
            return "error in updation";

        }finally {
            session.close();
        }
    }

    public List<CreateCourse> getCourseDetailsByName(String cname, User user) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from CreateCourse  where CourseName=:cname and CreatedBy.userName=:uname";
            Query query=session.createQuery(q);
            query.setParameter("cname",cname);
            query.setParameter("uname",user.getUserName());
            return query.list();

        }catch (Exception e)
        {
            System.out.println("error in course operation "+e);
            return null;

        }finally {
            session.close();

        }
    }

    public String deleteCourseById(int cid) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            String q="select id from CreateLecture  where createCourse.id=:id";
            Query query=session.createQuery(q);
            query.setParameter("id",cid);
           List<Integer> list=query.list();
           for(Integer i:list) {
              q="delete AttendanceRecord where lecture.id=:id";
               query=session.createQuery(q);
               query.setParameter("id",i.intValue());
               query.executeUpdate();

               q="delete LectureJoiningRequest where lecture.id=:id";
               query=session.createQuery(q);
               query.setParameter("id",i.intValue());
               query.executeUpdate();

               q="delete CreateLecture where id=:id";
               query=session.createQuery(q);
               query.setParameter("id",i.intValue());
               query.executeUpdate();

           }
           q="delete from LectureAtCollege where course.id=:id";
            query=session.createQuery(q);
           query.setParameter("id",cid);
           query.executeUpdate();

            q="delete from CreateCourse where id=:cid";
            query=session.createQuery(q);
            query.setParameter("cid",cid);
            query.executeUpdate();
            session.getTransaction().commit();
            return "Deleted Successfully";

        }catch (Exception e)
        {
            System.out.println("error in course operation "+e);
            session.getTransaction().rollback();
            return "error in deleting";

        }finally {
            session.close();

        }
    }

    public CreateCourse getCourseObjectByName(String cname) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from CreateCourse where CourseName=:cname";
            Query query=session.createQuery(q);
            query.setParameter("cname",cname);
            return (CreateCourse) query.uniqueResult();

        }catch (Exception e)
        {
            System.out.println("error in course operation "+e);
            return null;

        }finally {
            session.close();
        }
    }

    public List<CreateCourse> getCourseDetailsByName(String cname) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="select CourseName from CreateCourse where CourseName like :cname";
            Query query=session.createQuery(q);
            query.setParameter("cname",cname+"%");
            return query.list();

        }catch (Exception e)
        {
            System.out.println("error in course operation "+e);
            return null;

        }finally {
            session.close();
        }
    }

}
