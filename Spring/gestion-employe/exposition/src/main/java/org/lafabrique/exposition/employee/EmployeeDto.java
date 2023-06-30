package org.lafabrique.exposition.employee;

public class EmployeeDto {
    private String uid;
    private String firstname;
    private String lastname;

    public EmployeeDto(String uid, String firstname, String lastname) {
        this.uid = uid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public EmployeeDto() {
    }

    public String getUid() {
        return uid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
