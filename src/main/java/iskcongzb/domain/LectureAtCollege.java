package iskcongzb.domain;

import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
public class LectureAtCollege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @ManyToOne(cascade = {CascadeType.REMOVE})
    private User user;
    @ManyToOne(cascade = {CascadeType.REMOVE})
    private CreateCourse course;
    @Column(nullable = false)
    String LectureTittle;
    @Column(nullable = false)
    String Date;
    @Column(nullable = false)
    String StartTime;
    @Column(nullable = false)
    String EndTime;
    String SpeakerName;
    String LectureDescription;
    @Column(nullable = false)
    String CollegeName;
    @Column(nullable = false)
    String CollegeAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CreateCourse getCourse() {
        return course;
    }

    public void setCourse(CreateCourse course) {
        this.course = course;
    }

    public String getLectureTittle() {
        return LectureTittle;
    }

    public void setLectureTittle(String lectureTittle) {
        LectureTittle = lectureTittle;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getSpeakerName() {
        return SpeakerName;
    }

    public void setSpeakerName(String speakerName) {
        SpeakerName = speakerName;
    }

    public String getLectureDescription() {
        return LectureDescription;
    }

    public void setLectureDescription(String lectureDescription) {
        LectureDescription = lectureDescription;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

    public String getCollegeAddress() {
        return CollegeAddress;
    }

    public void setCollegeAddress(String collegeAddress) {
        CollegeAddress = collegeAddress;
    }

}
