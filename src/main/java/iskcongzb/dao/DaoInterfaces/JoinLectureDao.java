package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public interface JoinLectureDao {
    String joinALecture(CreateLecture lecture, User user);
}
