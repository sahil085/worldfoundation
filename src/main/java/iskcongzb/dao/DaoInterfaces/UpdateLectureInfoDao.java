package iskcongzb.dao.DaoInterfaces;

import iskcongzb.domain.CreateLecture;
import org.springframework.stereotype.Component;

@Component
public interface UpdateLectureInfoDao {

    boolean updateLectureInfo(CreateLecture lecture,int lecid);
    String setHangoutUrl(String url,int lid);
    String setWhiteBoardUrl(String url,int lid);
}
