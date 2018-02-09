package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.ListOfCreatedLecturesDao;
import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.LectureJoiningRequest;
import iskcongzb.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component

public class ListOfCreatedLecturesDaoImp implements ListOfCreatedLecturesDao {
    @Autowired
    SessionFactory sessionFactory;
    public List<CreateLecture> getListOfUpComingLectures() {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from CreateLecture where isLive =:islive and isActive=:isactive and date>=:cdate order by date,Time asc";
            Query query=session.createQuery(q);
            query.setParameter("islive",false);
            query.setParameter("isactive",true);
            DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String currentdate=dateFormat.format(new Date());
            query.setParameter("cdate",dateFormat.parse(currentdate));
            return query.list();

        }catch (Exception e)
        {
            System.out.println("error in list of crated lectures "+e);
            return null;
        }finally {
            session.close();
        }
    }

    public List<LectureJoiningRequest> getJoinedLecture(User user) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from LectureJoiningRequest where user=:user";
            Query query=session.createQuery(q);
            query.setParameter("user",user);
            return query.list();

        }catch (Exception e)
        {
            System.out.println("error in list of crated lectures "+e);
            return null;
        }finally {
            session.close();
        }
    }

    public CreateLecture getLectureById(int id) {
        Session session=sessionFactory.openSession();
        try
        {
            String q="from CreateLecture where id=:id";
            Query query=session.createQuery(q);
            query.setParameter("id",id);
            return (CreateLecture) query.uniqueResult();

        }catch (Exception e)
        {
            System.out.println("error in list of crated lectures "+e);
            return null;
        }finally {
            session.close();
        }
    }
}
