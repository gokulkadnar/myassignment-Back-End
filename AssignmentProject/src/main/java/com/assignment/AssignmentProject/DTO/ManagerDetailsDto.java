package com.assignment.AssignmentProject.DTO;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class ManagerDetailsDto {

    @NotNull(message = "firstName can not be null")
    private String firstName;

    @NotNull(message = "lastName can not be null")
    private String lastName;

    @NotNull(message = "email can not be null")
    @Email(message = "email address is not proper")
    private String email;

    @NotNull(message = "password can not be null")
    private String password;

    @NotNull(message = "address can not be null")
    private String address;

    @NotNull(message = "dob can not be null")
    private String dob;

    @NotNull
    private String company;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
