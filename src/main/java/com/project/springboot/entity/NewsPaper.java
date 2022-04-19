package com.project.springboot.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="newspaper")
public class NewsPaper {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name="newspaper_id")
    private String newsPaperId;

    @Column(name ="release_day")
    private Date releaseDay;

    @Column(name="number_of_release")
    private int numberOfRelease;

    public long getId() {
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
