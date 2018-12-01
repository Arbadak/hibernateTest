package com.arbadak.dbapi;

import javax.persistence.*;

@Entity
@Table(name = "doc")
public class Doc {

    @Id
    @Column(name="doc_id", columnDefinition ="INT", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer doc_id;


    @Column(name="doc_name", columnDefinition ="VARCHAR(115)", nullable = false)
    private String docName;

    @Column(name="doc_code", columnDefinition ="VARCHAR(3)",nullable = false)
    private String docCode;

}
