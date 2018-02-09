package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.CreateLecture;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseListOnPreacherPanel {
    List<CreateCourse> getCourseList(String uname);
    Long getNumberOfStudents(int id);
    List<CreateCourse> getCourseDetailsByName(String cname);
}
