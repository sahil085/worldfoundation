package iskcongzb.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Component
public class CreateLecture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinColumn(name = ("lecid"))
    int id;
    @Column(nullable = false)
    String Tittle;
    @Column(nullable = false)
    String Description;
    @Column(nullable = false)
    String SpeakerName;
    @Column (nullable = false)
    String SewaCoordinators;
    @Column(nullable = false)
    String Time;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    Date date;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    Date LastUpdate;
    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    Date LastUpdateionTime;
    @Column(nullable = false)
    String Venue;
    @Column(nullable = false)
    String Street;
    @Column(nullable = false)
            boolean isLive;
    String HangoutUrl;
 String Youtubeurl;
 @Column(nullable = false)
 boolean isActive;
  @ManyToOne
  private CreateCourse createCourse;
@ManyToOne
private User CreatedBy;
@Column(nullable = false)
    private String CourseName;

    public CreateCourse getCreateCourse() {
        return createCourse;
    }

    public void setCreateCourse(CreateCourse createCourse) {
        this.createCourse = createCourse;
    }

    public User getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(User createdBy) {
        CreatedBy = createdBy;
    }

    public Date getLastUpdateionTime() {
        return LastUpdateionTime;
    }

    public void setLastUpdateionTime(Date lastUpdateionTime) {
        LastUpdateionTime = lastUpdateionTime;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getSewaCoordinators() {
        return SewaCoordinators;
    }

    public void setSewaCoordinators(String sewaCoordinators) {
        SewaCoordinators = sewaCoordinators;
    }

    public String getSpeakerName() {
        return SpeakerName;
    }

    public void setSpeakerName(String speakerName) {
        SpeakerName = speakerName;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getLastUpdate() {
        return LastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        LastUpdate = lastUpdate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getHangoutUrl() {
        return HangoutUrl;
    }

    public void setHangoutUrl(String hangoutUrl) {
        HangoutUrl = hangoutUrl;
    }

    public String getYoutubeurl() {
        return Youtubeurl;
    }

    public void setYoutubeurl(String youtubeurl) {
        Youtubeurl = youtubeurl;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String venue) {
        Venue = venue;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }
}
