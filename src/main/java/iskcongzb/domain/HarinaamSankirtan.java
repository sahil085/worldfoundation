package iskcongzb.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
public class HarinaamSankirtan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String userName;
    @Column(unique = true,nullable = false)
    private String eMail;
    @Column(nullable = false)
    private String hsAdmin;
    @Column(nullable = false)
    private String venue;
    @Column(nullable = false)
    private String currentAddress;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private String time;
    @Column(nullable = false)
    private String vechile;
    @Column(nullable = false)
    private int numberOfVechiles;
    @Column(nullable = false)
    private String musicSystem;
    @Column(nullable = false)
    private String trolly;
    @Column(nullable = false)
    private String krishnaPrasadam;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private Long mobileNumber;
    @Column(nullable = false)
    private Long alternateMobileNumber;
//    @Lob
//    private byte[] locationTrackingImage;
    @Column(nullable = false)
    private boolean approvedStatus;

    public boolean isApprovedStatus() {
        return approvedStatus;
    }

    public void setApprovedStatus(boolean approvedStatus) {
        this.approvedStatus = approvedStatus;
    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getHsAdmin() {
        return hsAdmin;
    }

    public void setHsAdmin(String hsAdmin) {
        this.hsAdmin = hsAdmin;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVechile() {
        return vechile;
    }

    public void setVechile(String vechile) {
        this.vechile = vechile;
    }

    public int getNumberOfVechiles() {
        return numberOfVechiles;
    }

    public void setNumberOfVechiles(int numberOfVechiles) {
        this.numberOfVechiles = numberOfVechiles;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(String musicSystem) {
        this.musicSystem = musicSystem;
    }

    public String getTrolly() {
        return trolly;
    }

    public void setTrolly(String trolly) {
        this.trolly = trolly;
    }

    public String getKrishnaPrasadam() { return krishnaPrasadam; }

    public void setKrishnaPrasadam(String krishnaPrasadam) { this.krishnaPrasadam = krishnaPrasadam; }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getAlternateMobileNumber() {
        return alternateMobileNumber;
    }

    public void setAlternateMobileNumber(Long alternateMobileNumber) {
        this.alternateMobileNumber = alternateMobileNumber;
    }

//    public byte[] getLocationTrackingImage() {
//        return locationTrackingImage;
//    }
//
//    public void setLocationTrackingImage(byte[] locationTrackingImage) {
//        this.locationTrackingImage = locationTrackingImage;
//    }
}
