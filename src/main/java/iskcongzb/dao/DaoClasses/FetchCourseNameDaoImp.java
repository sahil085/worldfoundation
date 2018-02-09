package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.FetchCourseNameDao;
import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FetchCourseNameDaoImp implements FetchCourseNameDao {
    @Autowired
    SessionFactory sessionFactory;
    public List<CreateCourse> getCourseName(String cname,User user) {
        Session session=sessionFactory.openSession();
        System.out.println(user.getUserName()+" asdk");
        try
        {
            String q="SELECT CourseName from CreateCourse where CourseName like :cname and CreatedBy =:userobj";
            Query query=session.createQuery(q);
            query.setParameter("userobj",user);
            query.setString("cname", cname + "%");

            List<CreateCourse> list=query.list();
            return list;
        }catch (Exception e)
        {
            System.out.println("error in fetchCourse Name "+e);
            return null;
        }finally {
            session.close();
        }
    }
}
