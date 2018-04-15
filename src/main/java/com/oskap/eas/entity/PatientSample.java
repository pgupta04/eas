package com.oskap.eas.entity;

import javax.persistence.*;

/**
 * Created by ZNE45571 on 4/15/18.
 */
@Entity
public class PatientSample {

    @Id
    @GeneratedValue
    private Long patientSampleId;

    @Column(nullable = false)
    private Long serialNum;

    @Column(nullable = false)
    private float origionalQuantity;

    @Column(nullable = false)
    private float remainingQuantity;

    @Column(nullable = false)
    private String Status;

    @OneToOne
    @JoinColumn(name = "patientId")
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "sampleTypeId")
    private SampleType sampleType;

    @OneToOne
    @JoinColumn(name = "storageBinId")
    private StorageBin storageBin;

    public Long getPatientSampleId() {
        return patientSampleId;
    }

    public void setPatientSampleId(Long patientSampleId) {
        this.patientSampleId = patientSampleId;
    }

    public Long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Long serialNum) {
        this.serialNum = serialNum;
    }

    public float getOrigionalQuantity() {
        return origionalQuantity;
    }

    public void setOrigionalQuantity(float origionalQuantity) {
        this.origionalQuantity = origionalQuantity;
    }

    public float getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(float remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public SampleType getSampleType() {
        return sampleType;
    }

    public void setSampleType(SampleType sampleType) {
        this.sampleType = sampleType;
    }

    public StorageBin getStorageBin() {
        return storageBin;
    }

    public void setStorageBin(StorageBin storageBin) {
        this.storageBin = storageBin;
    }
}
