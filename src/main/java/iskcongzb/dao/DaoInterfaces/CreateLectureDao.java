package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface CreateLectureDao {
    boolean createLecture(CreateLecture lecture, User user);
}
