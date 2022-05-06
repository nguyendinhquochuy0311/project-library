package com.project.springboot.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="newspaper")
public class NewsPaper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="newspaper_id")
    private String newsPaperId;

    @Column(name ="release_day")
    private int releaseDay;

    @Column(name="number_of_release")
    private int numberOfRelease;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNewsPaperId() {
        return newsPaperId;
    }

    public void setNewsPaperId(String newsPaperId) {
        this.newsPaperId = newsPaperId;
    }

    public int getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(int releaseDay) {
        this.releaseDay = releaseDay;
    }

    public int getNumberOfRelease() {
        return numberOfRelease;
    }

    public void setNumberOfRelease(int numberOfRelease) {
        this.numberOfRelease = numberOfRelease;
    }
}
