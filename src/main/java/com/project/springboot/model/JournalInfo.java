package com.project.springboot.model;

public class JournalInfo {
    private int id;
    private String journalId;
    private int releaseNumber;
    private int releaseMonth;
    private int numberOfRelease;

    public JournalInfo() {
    }

    public JournalInfo(int id, String journalId, int releaseNumber, int releaseMonth, int numberOfRelease) {
        this.id = id;
        this.journalId = journalId;
        this.releaseNumber = releaseNumber;
        this.releaseMonth = releaseMonth;
        this.numberOfRelease = numberOfRelease;
    }

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
