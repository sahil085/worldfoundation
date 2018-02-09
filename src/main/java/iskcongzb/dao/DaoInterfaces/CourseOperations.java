package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseOperations {
    String updateCourseinfo(CreateCourse createCourse);
    List<CreateCourse> getCourseDetailsByName(String cname,User user);
    String deleteCourseById(int cid);
    CreateCourse getCourseObjectByName(String cname);
    List<CreateCourse> getCourseDetailsByName(String cname);

}
