package com.project.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name ="manage")
public class Manage {
    @Id
    @GeneratedValue
    @Column(name ="id")
    private int id;

    @Column(name ="document_id")
    private String documentId;

    @Column(name ="publishing_company")
    private String publishingCompany;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }
}
