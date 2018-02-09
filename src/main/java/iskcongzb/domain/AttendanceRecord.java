package iskcongzb.domain;

import org.hibernate.annotations.Cascade;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Component
public class AttendanceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @OneToOne
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = ("lecid"),nullable=false)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private CreateLecture lecture;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
