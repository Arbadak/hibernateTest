package com.arbadak.test;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="user")
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

    @Column(name="doc_number", columnDefinition ="INT(10)", nullable = false)
    private Integer docNumber;

    @Column(name="doc_date", columnDefinition ="DATE", nullable = false)
    private LocalDate docDate;

   /*@OneToMany (cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "citizenship_id")
    private List<Country> citizenshipID;*/

    @ManyToOne
    @JoinColumn(name = "citizenship_id")
    private Country citizenshipCountry;

    @Column(name="is_identified", columnDefinition ="TINYINT", nullable = true)
    private Integer isIdentified;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office bindedOffice;



}
