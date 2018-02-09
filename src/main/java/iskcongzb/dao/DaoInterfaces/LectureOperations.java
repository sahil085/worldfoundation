package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.CreateCourse;
import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LectureOperations {
    List<CreateLecture> getLectureList(User user);
    CreateCourse getCourseForLecture(String CourseName);
    List<CreateLecture> getLectureById(int lid);
    String deleteLectureById(int lid);
    List<CreateLecture> getlectureNames(String lname);
    List<CreateLecture> getLectureDetailsByName(String lname);
    List<CreateLecture> getRecentlectures();
    CreateLecture getSingleLectureByName(String lname);
    String endLecture(int lid);
    void updateLiveStatusOfLecture(int lid);
}
