package com.project.springboot.model;

import java.sql.Date;

public class NewsPaperInfo {
    private int id;
    private String newsPaperId;
    private Date releaseDay;
    private int numberOfRelease;

    public NewsPaperInfo() {
    }

    public NewsPaperInfo(int id, String newsPaperId, Date releaseDay, int numberOfRelease) {
        this.id = id;
        this.newsPaperId = newsPaperId;
        this.releaseDay = releaseDay;
        this.numberOfRelease = numberOfRelease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewsPaperId() {
        return newsPaperId;
    }

    public void setNewsPaperId(String newsPaperId) {
        this.newsPaperId = newsPaperId;
    }

    public Date getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(Date releaseDay) {
        this.releaseDay = releaseDay;
    }

    public int getNumberOfRelease() {
        return numberOfRelease;
    }

    public void setNumberOfRelease(int numberOfRelease) {
        this.numberOfRelease = numberOfRelease;
    }
}
