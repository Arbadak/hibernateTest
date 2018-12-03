package com.arbadak.dbapi;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="user")
@SecondaryTable(name="doc_data", pkJoinColumns = {@PrimaryKeyJoinColumn(name = "id_user")})
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_user", columnDefinition ="INT", nullable = false)
    private Integer userId;

    @Column(name="first_name", columnDefinition ="VARCHAR(15)", nullable = false)
    private String firstName;

    @Column(name="second_name", columnDefinition ="VARCHAR(15)", nullable = true)
    private String secondName;

    @Column(name="last_name", columnDefinition ="VARCHAR(15)", nullable = true)
    private String lastName;

    @Column(name="position", columnDefinition ="VARCHAR(25)", nullable = false)
    private String position;

    @Column(name="user_phone", columnDefinition ="INT(11)", nullable = true)
    private Integer userPhone;

    @ManyToOne
    @JoinColumn(name = "doc_id")
    private Doc docId;

    @Column(name="doc_number", table = "doc_data", columnDefinition ="INT(10)", nullable = false)
    private Integer docNumber;

    @Column(name="doc_date", table = "doc_data", columnDefinition ="DATE", nullable = false)
    private LocalDate docDate;

    @ManyToOne
    @JoinColumn(name = "citizenship_id")
    private Country citizenshipCountry;

    @Column(name="is_identified", columnDefinition ="BOOLEAN", nullable = true)
    private Boolean isIdentified;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office bindedOffice;



}
