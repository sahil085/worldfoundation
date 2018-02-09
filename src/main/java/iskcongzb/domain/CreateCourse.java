package iskcongzb.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Component
public class CreateCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false)
    String CourseCategory;
    @Column(nullable = false)
    String CourseName;
    @ManyToOne
    private User CreatedBy;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    Date dateOfCreation;
    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    Date timeOfCreation;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    Date lastUpdationDate;
    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
   Date LastUpdateionTime;
    @Column(nullable = false)
    String CourseDescription;

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

    public User getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(User createdBy) {
        CreatedBy = createdBy;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Date getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(Date timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    public Date getLastUpdationDate() {
        return lastUpdationDate;
    }

    public void setLastUpdationDate(Date lastUpdationDate) {
        this.lastUpdationDate = lastUpdationDate;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        CourseDescription = courseDescription;
    }

    public String getCourseCategory() {
        return CourseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        CourseCategory = courseCategory;
    }
}
