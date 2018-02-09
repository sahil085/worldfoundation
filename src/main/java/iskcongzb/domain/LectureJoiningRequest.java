package iskcongzb.domain;

import org.hibernate.annotations.Cascade;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
import org.hibernate.annotations.CascadeType;


@Entity
@Component

public class LectureJoiningRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @ManyToOne
    private User user;
    @ManyToOne(cascade = {javax.persistence.CascadeType.ALL})
    private CreateLecture lecture;

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

    public CreateLecture getLecture() {
        return lecture;
    }

    public void setLecture(CreateLecture lecture) {
        this.lecture = lecture;
    }
}
