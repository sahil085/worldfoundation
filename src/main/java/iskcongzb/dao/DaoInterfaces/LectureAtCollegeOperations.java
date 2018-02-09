package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.LectureAtCollege;
import org.springframework.stereotype.Component;

@Component
public interface LectureAtCollegeOperations {
    String createRequest(LectureAtCollege lectureAtCollege);

}
