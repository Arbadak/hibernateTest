package com.arbadak.test;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="country")
public class Country {

    @Id
    /*@Column (name = "citizenship_id_tbl_country", columnDefinition = "INT", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer citizinshipIdCountry;*/

    @Column (name = "citizenship_id", columnDefinition = "INT", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer citizinshipId;

    @Column(name="citizenship_code", columnDefinition ="VARCHAR(3)", nullable = false)
    private String citizenshipCode;

    @Column(name="citizenship_name", columnDefinition = "VARCHAR(60)", nullable = false)
    private String citizenshipName;


}
