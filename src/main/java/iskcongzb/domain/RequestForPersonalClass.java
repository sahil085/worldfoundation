package iskcongzb.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
public class RequestForPersonalClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(nullable = false)
    String Query;
    @Column(nullable = false)
    String Time;
    @Column(nullable = false)
    String Date;
    @Column(nullable = false)
    String SpeakerName;
    @Column(nullable = false)
    String Venue;
    @Column(nullable = false)
    String LectureTittle;

@ManyToOne
private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLectureTittle() {
        return LectureTittle;
    }

    public void setLectureTittle(String lectureTittle) {
        LectureTittle = lectureTittle;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuery() {
        return Query;
    }

    public void setQuery(String query) {
        Query = query;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getSpeakerName() {
        return SpeakerName;
    }

    public void setSpeakerName(String speakerName) {
        SpeakerName = speakerName;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String venue) {
        Venue = venue;
    }
}
