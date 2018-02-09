package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface MarkAttendanceInIyfClassDao {
    String markUserAsPresent(CreateLecture lecture, User user);
    String markUserAsAbsent(CreateLecture lecture, User user);

}
