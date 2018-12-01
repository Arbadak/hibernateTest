package com.arbadak.dbapi;

import javax.persistence.*;

@Entity
@Table(name="office")
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="office_id", columnDefinition ="INT",  nullable = false)
    private long officeId;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organizationId ;

    @Column(name="address", columnDefinition ="VARCHAR(100)", nullable = false)
    private String address;

    @Column(name="phone", columnDefinition ="INT(11)", nullable = true)
    private int phoneOffice;

    @Column(name="is_active", columnDefinition ="BOOLEAN", nullable = true)
    private Boolean isActive;

    @Column(name="is_main", columnDefinition ="BOOLEAN", nullable = true)
    private Boolean isMain;



}
