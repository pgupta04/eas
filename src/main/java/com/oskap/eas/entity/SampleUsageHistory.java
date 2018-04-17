package com.oskap.eas.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ZNE45571 on 4/16/18.
 */
@Entity
public class SampleUsageHistory {

    @Id
    @GeneratedValue
    private Long sampleUsageHistId;

    @ManyToOne
    @JoinColumn(name = "patientSampleId")
    private PatientSample patientSample;

    @Column(nullable = false)
    private String issuedTo;

    @Column(nullable = false)
    private Date issuedDate;

    private Date turnInDate;

    public Long getSampleUsageHistId() {
        return sampleUsageHistId;
    }

    public void setSampleUsageHistId(Long sampleUsageHistId) {
        this.sampleUsageHistId = sampleUsageHistId;
    }

    public PatientSample getPatientSample() {
        return patientSample;
    }

    public void setPatientSample(PatientSample patientSample) {
        this.patientSample = patientSample;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Date getTurnInDate() {
        return turnInDate;
    }

    public void setTurnInDate(Date turnInDate) {
        this.turnInDate = turnInDate;
    }
}
