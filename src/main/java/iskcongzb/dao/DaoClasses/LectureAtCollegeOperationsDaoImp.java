package iskcongzb.dao.DaoClasses;

import iskcongzb.dao.DaoInterfaces.LectureAtCollegeOperations;
import iskcongzb.domain.LectureAtCollege;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LectureAtCollegeOperationsDaoImp implements LectureAtCollegeOperations {
    @Autowired
    SessionFactory sessionFactory;
    public String createRequest(LectureAtCollege lectureAtCollege) {
        Session session=sessionFactory.openSession();
        try
        {
          session.beginTransaction();
          session.save(lectureAtCollege);
          session.getTransaction().commit();;
          return "Request Sent To IYF Admin We Will Contact You Shortly";

        }catch (Exception e)
        {
            System.out.println("error in arrange lecture at college "+e);
            return "Oops..!! Some Error Occured Please Try Again";

        }finally {
            session.close();
        }

    }
}
