package iskcongzb.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(nullable = false,unique = true)
    String userName;
    @Column(nullable = false)
    String firstName;
    @Column(nullable = false)
    String lastName;
    @Column(nullable = false,unique = true)
    String email;
    @Column(nullable = false)
    String password;
    @Column(nullable = false,unique = true)
    String mobileNumber;
    @Column(nullable = false)
    String address;
    @Column(nullable = false)
    String adminType;
    @Column(nullable = false)
    String state;
    @Column(nullable = false)
    String deeksha;
    @Column(nullable = false)
    int roundsChanting;
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    public String getDeeksha() {
        return deeksha;
    }

    public void setDeeksha(String deeksha) {
        this.deeksha = deeksha;
    }

    public int getRoundsChanting() {
        return roundsChanting;
    }

    public void setRoundsChanting(int roundsChanting) {
        this.roundsChanting = roundsChanting;
    }
}
