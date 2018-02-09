package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface CreateCourseDao {
    boolean createCourse(CreateCourse createCourse, User user);
}
