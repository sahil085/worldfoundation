package iskcongzb.domain;

import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class RequestForBookDistribution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String EmailId;
    private String Name;
    private String PermanentAddress;
    private String City;
    private String LandMark;
    private String FacilitatorName;
    private boolean RequestAccepted;

    public boolean isRequestAccepted() {
        return RequestAccepted;
    }

    public void setRequestAccepted(boolean requestAccepted) {
        RequestAccepted = requestAccepted;
    }

    private int MobileNumber;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacilitatorName() {
        return FacilitatorName;
    }

    public void setFacilitatorName(String facilitatorName) {
        FacilitatorName = facilitatorName;
    }



    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPermanentAddress() {
        return PermanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        PermanentAddress = permanentAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getLandMark() {
        return LandMark;
    }

    public void setLandMark(String landMark) {
        LandMark = landMark;
    }

    public int getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        MobileNumber = mobileNumber;
    }
}
