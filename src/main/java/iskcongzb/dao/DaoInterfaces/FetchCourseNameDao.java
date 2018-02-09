package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FetchCourseNameDao {
    List<CreateCourse> getCourseName(String cname,User user);
}
