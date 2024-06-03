package src.Entities;
import src.Abstract.Entity;

import java.sql.Date;

public class Customer implements Entity {

    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String nationalityIdentity;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, Date birthDate, String nationalityIdentity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.nationalityIdentity = nationalityIdentity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationalityIdentity() {
        return nationalityIdentity;
    }

    public void setNationalityIdentity(String nationalityIdentity) {
        this.nationalityIdentity = nationalityIdentity;
    }



}
