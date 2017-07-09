package patientProgram;

import java.util.Date;

/**
 * Created by hector on 7/9/17.
 */
public class Patient {
    private Date dateOfBirth;
    private String firstName;
    private String lastName;
    private Long SSN;
    private Long phoneNumber;
    private String email;
    private String streetAddress;
    private String state;
    private Integer zipCode;

    public Patient(Date dateOfBirth, String firstName, String lastName, Long SSN, Long phoneNumber, String streetAddress,
                   String state, Integer zipCode) {
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Patient(Date dateOfBirth, String firstName, String lastName, Long SSN, Long phoneNumber, String email,
                   String streetAddress, String state, Integer zipCode) {
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.streetAddress = streetAddress;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getSSN() {
        return SSN;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getState() {
        return state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void updateAddress(String streetAddress, String state, Integer zipCode){
        this.streetAddress = streetAddress;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void updatePhoneNumber(Long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void updateEmail(String email){
        this.email = email;
    }
}
