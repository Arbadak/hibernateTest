package com.arbadak.dbapi.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="user")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", columnDefinition ="INT", nullable = false)
    private Integer userId;

    @Column(name="first_name", columnDefinition ="VARCHAR(15)", nullable = false)
    private String firstName;

    @Column(name="second_name", columnDefinition ="VARCHAR(15)", nullable = true)
    private String secondName;

    @Column(name="last_name", columnDefinition ="VARCHAR(15)", nullable = true)
    private String lastName;

    @Column(name="position", columnDefinition ="VARCHAR(30)", nullable = false)
    private String position;

    @Column(name="phone", columnDefinition ="INT(11)", nullable = true)
    private Integer userPhone;

    @OneToOne
    //@JoinColumn(name = "id")
    //@Column(name="document")
    private DocData userDocument;

    @OneToOne
    //@JoinColumn(name = "id")
    //@Column(name="citizenship")
    private Country citizenshipCountry;

    @Column(name="is_identified", columnDefinition ="BOOLEAN", nullable = true)
    private Boolean isIdentified;

    @OneToOne
    //@Column(name="office_emp")
    //@JoinColumn(name = "id")
    private Office bindedOffice;

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public DocData getUserDocument() {
        return userDocument;
    }

    public void setUserDocument(DocData userDocument) {
        this.userDocument = userDocument;
    }

    public Country getCitizenshipCountry() {
        return citizenshipCountry;
    }

    public void setCitizenshipCountry(Country citizenshipCountry) {
        this.citizenshipCountry = citizenshipCountry;
    }

    public Boolean getIdentified() {
        return isIdentified;
    }

    public void setIdentified(Boolean identified) {
        isIdentified = identified;
    }

    public Office getBindedOffice() {
        return bindedOffice;
    }

    public void setBindedOffice(Office bindedOffice) {
        this.bindedOffice = bindedOffice;
    }
}
