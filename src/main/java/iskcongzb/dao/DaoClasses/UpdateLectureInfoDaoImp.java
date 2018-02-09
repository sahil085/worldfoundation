package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.UpdateLectureInfoDao;
import iskcongzb.domain.CreateLecture;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class UpdateLectureInfoDaoImp implements UpdateLectureInfoDao {
    @Autowired
    SessionFactory sessionFactory;
    public boolean updateLectureInfo(CreateLecture lecture, int lecid) {
        Session session=sessionFactory.openSession();
        try
        {

            session.beginTransaction();
            Criteria criteria = session.createCriteria(CreateLecture.class);
            criteria.add(Restrictions.eq("id", lecid));
           CreateLecture createLecture= (CreateLecture) criteria.uniqueResult();
           createLecture.setCreateCourse(lecture.getCreateCourse());
           createLecture.setSpeakerName(lecture.getSpeakerName());
           createLecture.setLastUpdate(new Date());
           createLecture.setLastUpdateionTime(new Date());
           createLecture.setDate(lecture.getDate());
           createLecture.setDescription(lecture.getDescription());
           createLecture.setSewaCoordinators(lecture.getSewaCoordinators());
           createLecture.setStreet(lecture.getStreet());
           createLecture.setTittle(lecture.getTittle());
           createLecture.setTime(lecture.getTime());
           createLecture.setVenue(lecture.getVenue());
           session.saveOrUpdate(createLecture);
           session.getTransaction().commit();
           return true;
        }catch (Exception e)
        {
            session.getTransaction().rollback();
            System.out.println("error in update of lecture info "+e);
            return false;
        }finally {
            session.close();
        }
    }

    public String setHangoutUrl(String url, int lid) {
        Session session=sessionFactory.openSession();
                try
                {
                    session.beginTransaction();
                    Criteria criteria = session.createCriteria(CreateLecture.class);
                    criteria.add(Restrictions.eq("id", lid));
                    CreateLecture createLecture= (CreateLecture) criteria.uniqueResult();
                    createLecture.setHangoutUrl(url);
                    session.saveOrUpdate(createLecture);
                    session.getTransaction().commit();
                    return "Hangout Url Set To The Lecture "+createLecture.getTittle();

                }catch (Exception e)
                {
                    session.getTransaction().rollback();
                    return "Error";
                }finally {
            session.close();
                }
    }

    public String setWhiteBoardUrl(String url, int lid) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(CreateLecture.class);
            criteria.add(Restrictions.eq("id", lid));
            CreateLecture createLecture= (CreateLecture) criteria.uniqueResult();
            createLecture.setYoutubeurl(url);
            session.saveOrUpdate(createLecture);
            session.getTransaction().commit();
            return "WhiteBoard Url Set To The Lecture "+createLecture.getTittle();

        }catch (Exception e)
        {
            session.getTransaction().rollback();
            return "Error";
        }finally {
            session.close();
        }

    }
}
