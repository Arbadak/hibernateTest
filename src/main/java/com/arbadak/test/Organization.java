package com.arbadak.test;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="organization")

public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="org_id", columnDefinition ="INT", nullable = false)
    private Integer orgId;

    @Column(name="inn", columnDefinition ="INT(12)", nullable = false)
    private Integer inn;

    @Column(name="full_name", columnDefinition ="VARCHAR(60)", nullable = false)
    private String fullNameOranization;

    @Column(name="short_name", columnDefinition ="VARCHAR(30)", nullable = true)
    private String shortNameOranization;

    @Column(name="kpp", columnDefinition ="INT(9)")
    private Integer kpp;




















}
