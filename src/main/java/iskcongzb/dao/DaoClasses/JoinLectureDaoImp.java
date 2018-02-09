package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.JoinLectureDao;
import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.LectureJoiningRequest;
import iskcongzb.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JoinLectureDaoImp implements JoinLectureDao {
    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    LectureJoiningRequest lectureJoiningRequest;
    public String joinALecture(CreateLecture lecture, User user) {
        Session session=sessionFactory.openSession();
        try
        {
            lectureJoiningRequest.setLecture(lecture);
            lectureJoiningRequest.setUser(user);
            session.beginTransaction();
            session.save(lectureJoiningRequest);
            session.getTransaction().commit();
            return "Successfully joined";

        }catch (Exception e)
        {
            System.out.println("error in joinlecture "+e);
            return "error in joining";

        }finally {
            session.close();
        }
    }
}
