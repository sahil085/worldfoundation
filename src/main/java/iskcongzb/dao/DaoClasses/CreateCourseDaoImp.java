package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.CreateCourseDao;
import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CreateCourseDaoImp implements CreateCourseDao {
    @Autowired
    SessionFactory sessionFactory;
    public boolean createCourse(CreateCourse createCourse, User user) {
        Session session=sessionFactory.openSession();
        try
        {
            session.beginTransaction();
            createCourse.setCreatedBy(user);
            createCourse.setDateOfCreation(new Date());
            createCourse.setLastUpdationDate(new Date());
            createCourse.setTimeOfCreation(new Date());
            createCourse.setLastUpdateionTime(new Date());
            session.save(createCourse);
            session.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            System.out.println("error in create course dao "+e);
              session.getTransaction().rollback();
            return false;
        }finally {
            session.close();
        }

    }
}
