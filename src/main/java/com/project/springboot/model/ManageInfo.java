package com.project.springboot.model;

public class ManageInfo {
    private int id;
    private String documentId;
    private String publishingCompany;

    public ManageInfo() {
    }

    public ManageInfo(int id, String documentId, String publishingCompany) {
        this.id = id;
        this.documentId = documentId;
        this.publishingCompany = publishingCompany;
    }

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
