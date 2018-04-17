package com.oskap.eas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by ZNE45571 on 4/14/18.
 */
@Entity
public class Patient {

    @Id
    @GeneratedValue
    private long patientId;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String gender;

    @Column(unique = true, nullable = false)
    private String uuid;

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
