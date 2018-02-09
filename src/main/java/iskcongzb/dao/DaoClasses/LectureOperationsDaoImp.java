package iskcongzb.dao.DaoClasses;


import iskcongzb.dao.DaoInterfaces.LectureOperations;
import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class LectureOperationsDaoImp implements LectureOperations {
    @Autowired
    SessionFactory sessionFactory;
    public List<CreateLecture> getLectureList(User user) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from CreateLecture where CreatedBy=:user and isActive=:status and isLive=:live";
            Query query=session.createQuery(q);
            System.out.println("come here");
            query.setParameter("user",user);
            query.setParameter("status",true);
            query.setParameter("live",false);

            return query.list();

        }catch (Exception e)
        {
            System.out.println("error in fetch lecture dao "+e);
            return null;

        }finally {
            session.close();
        }
    }

    public CreateCourse getCourseForLecture(String CourseName) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from CreateCourse  where CourseName=:cname";
            Query query=session.createQuery(q);
            query.setParameter("cname",CourseName);
            return (CreateCourse) query.uniqueResult();

        }catch (Exception e)
        {

        }finally {
            session.close();
        }
        return null;
    }

    public List<CreateLecture> getLectureById(int lid) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from CreateLecture where id=:id";
            Query query=session.createQuery(q);
            query.setParameter("id",lid);
            return query.list();
        }catch (Exception e)
        {
            System.out.println("error in finding lecture by id "+e);
            return null;

        }finally {
            session.close();
        }

    }

    public String deleteLectureById(int lid) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();

          String q="delete AttendanceRecord where lecture.id=:id";
          Query query=session.createQuery(q);
          query.setParameter("id",lid);
            query.executeUpdate();

          q="delete LectureJoiningRequest where lecture.id=:id";
            query=session.createQuery(q);
          query.setParameter("id",lid);
          query.executeUpdate();

          q="delete CreateLecture where id=:id";
            query=session.createQuery(q);
          query.setParameter("id",lid);
          query.executeUpdate();
          session.getTransaction().commit();

            return "Deleted Successfully";
        }catch (Exception e)
        {
            System.out.println("error in finding lecture by id "+e);
            return "error while deleting";

        }finally {
            session.close();
        }

    }

    public List<CreateLecture> getlectureNames(String lname) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="select Tittle from CreateLecture where Tittle like :lname";
            Query query=session.createQuery(q);
            query.setString("lname", lname + "%");
            return query.list();
        }catch (Exception e)
        {
            System.out.println("error in finding lecture by id "+e);
            return null;

        }finally {
            session.close();
        }
    }

    public List<CreateLecture> getLectureDetailsByName(String lname) {
        Session session=sessionFactory.openSession();
        try
        {
            String q=" from CreateLecture where Tittle=:lname";
            Query query=session.createQuery(q);
            query.setString("lname", lname);
            return query.list();
        }catch (Exception e)
        {
            System.out.println("error in finding lecture by id "+e);
            return null;

        }finally {
            session.close();
        }
    }

    public List<CreateLecture> getRecentlectures() {
       Session session=sessionFactory.openSession();
       try
       {
           String q="from CreateLecture where isActive=:status and isLive=:islive";
           Query query=session.createQuery(q);
           query.setParameter("status",false);
           query.setParameter("islive",false);
           return query.list();

       }catch (Exception e)
       {
           System.out.println("error in recent lecture operation "+e);
           return null;

       }finally {
           session.close();
       }
    }

    public CreateLecture getSingleLectureByName(String lname) {

        Session session=sessionFactory.openSession();
        try
        {
            String q="from CreateLecture where Tittle=:lname";
            Query query=session.createQuery(q);
            query.setParameter("lname",lname);
            return (CreateLecture) query.uniqueResult();
        }catch (Exception e)
        {
            System.out.println("lecture operation error "+e);
   return null;
        }finally {
            session.close();
        }
    }

    public String endLecture(int lid) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            String q="update  CreateLecture set isLive=:livestatus,isActive=:status where id=:lid";
            Query query=session.createQuery(q);
            query.setParameter("livestatus",false);
            query.setParameter("status",false);
            query.setParameter("lid",lid);
            query.executeUpdate();
            session.getTransaction().commit();
            return "Lecture Ended Successfully ";

        }catch (Exception e)
        {
            System.out.println("error in end lecture operation "+e);
            return "error in ending lecture";

        }finally {
            session.close();
        }
    }

    public void updateLiveStatusOfLecture(int lid) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            String q="update  CreateLecture set isLive=:livestatus where id=:lid";
            Query query=session.createQuery(q);
            query.setParameter("livestatus",true);
            query.setParameter("lid",lid);
            query.executeUpdate();
            session.getTransaction().commit();

        }catch (Exception e)
        {
            System.out.println("error in live status update "+e);
        }finally {
            session.close();
        }
    }
}
