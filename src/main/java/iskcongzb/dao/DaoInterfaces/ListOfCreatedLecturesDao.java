package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.CreateLecture;
import iskcongzb.domain.LectureJoiningRequest;
import iskcongzb.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ListOfCreatedLecturesDao {
    List<CreateLecture> getListOfUpComingLectures();
    List<LectureJoiningRequest> getJoinedLecture(User user);
    CreateLecture getLectureById(int id);
}
