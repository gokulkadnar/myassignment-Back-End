package com.assignment.AssignmentProject.DTO;


import javax.validation.constraints.NotNull;

public class EmployeeDetailsDto {

    @NotNull(message = "firstName can not be null")
    private String firstName;
    @NotNull(message = "lastName can not be null")
    private String lastName;
    @NotNull(message = "address can not be null")
    private String address;
    @NotNull(message = "dob can not be null")
    private String dob;
    @NotNull(message = "mobile can not be null")
    private String mobile;
    @NotNull(message = "city can not be null")
    private String city;

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
