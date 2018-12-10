package com.arbadak.dbapi.entity;


import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {

    @Id
    @Column (name = "id", columnDefinition = "INT", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer citizinshipId;

    @Column(name="code", columnDefinition ="VARCHAR(3)", nullable = false)
    private String citizenshipCode;

    @Column(name="name", columnDefinition = "VARCHAR(60)", nullable = false)
    private String citizenshipName;

    public Country() {
    }

    public Integer getCitizinshipId() {
        return citizinshipId;
    }

    public void setCitizinshipId(Integer citizinshipId) {
        this.citizinshipId = citizinshipId;
    }

    public String getCitizenshipCode() {
        return citizenshipCode;
    }

    public void setCitizenshipCode(String citizenshipCode) {
        this.citizenshipCode = citizenshipCode;
    }

    public String getCitizenshipName() {
        return citizenshipName;
    }

    public void setCitizenshipName(String citizenshipName) {
        this.citizenshipName = citizenshipName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "citizinshipId=" + citizinshipId +
                ", citizenshipCode='" + citizenshipCode + '\'' +
                ", citizenshipName='" + citizenshipName + '\'' +
                '}';
    }
}
