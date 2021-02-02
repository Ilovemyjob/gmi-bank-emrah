package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Applicant {

    private Integer id;
    private String ssn;
    private String firstName;
    private String lastName;
    private String address;
    private String mobilePhoneNumber;
    private Integer userId;
    private String userName;
    private String email;
    private String createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Applicant() {
    }

    public Applicant(Integer id, String ssn, String firstName, String lastName, String address, String mobilePhoneNumber, Integer userId, String userName, String email, String createDate) {
        this.id = id;
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("ssn", ssn).append("firstName", firstName).append("lastName", lastName).append("address", address).append("mobilePhoneNumber", mobilePhoneNumber).append("userId", userId).append("userName", userName).append("email", email).append("createDate", createDate).toString();
    }

}