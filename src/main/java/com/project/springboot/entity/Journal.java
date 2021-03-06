package com.project.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name ="journal")
public class Journal {

    @Id
    @GeneratedValue
    @Column(name ="id")
    private int id;

    @Column(name ="journal_id")
    private String journalId;

    @Column(name ="release_number")
    private int releaseNumber;

    @Column(name = "release_month")
    private int releaseMonth;

    @Column(name ="number_of_release")
    private int numberOfRelease;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJournalId() {
        return journalId;
    }

    public void setJournalId(String journalId) {
        this.journalId = journalId;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public int getNumberOfRelease() {
        return numberOfRelease;
    }

    public void setNumberOfRelease(int numberOfRelease) {
        this.numberOfRelease = numberOfRelease;
    }
}
