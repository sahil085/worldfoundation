package iskcongzb.domain;

import org.springframework.stereotype.Component;

@Component
public class RequestAFacilitator {
    String UserName,EmailId,permanentAddress;
    int MobileNumber;
    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public int getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        MobileNumber = mobileNumber;
    }

}
