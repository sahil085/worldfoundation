package iskon.beans;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HariNaamsankirtan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String emailOfUser;
    String place;
    String Date,Time,Hsadmin;
    int approvedstatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailOfUser() {
        return emailOfUser;
    }

    public void setEmailOfUser(String emailOfUser) {
        this.emailOfUser = emailOfUser;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getHsadmin() {
        return Hsadmin;
    }

    public void setHsadmin(String hsadmin) {
        Hsadmin = hsadmin;
    }

    public int getApprovedstatus() {
        return approvedstatus;
    }

    public void setApprovedstatus(int approvedstatus) {
        this.approvedstatus = approvedstatus;
    }
}
