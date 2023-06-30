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

    public String getUid() {
        return uid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
