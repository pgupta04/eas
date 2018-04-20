package com.oskap.eas.entity;

import javax.persistence.*;

/**
 * Created by ZNE45571 on 4/15/18.
 */
@Entity
public class PatientSamples {

    @Id
    @GeneratedValue
    private Long patientSampleId;

    @Column(nullable = false)
    private String barcode;

    @Column(nullable = false)
    private float originalQuantity;

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

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public float getOriginalQuantity() {
        return originalQuantity;
    }

    public void setOriginalQuantity(float originalQuantity) {
        this.originalQuantity = originalQuantity;
    }
}