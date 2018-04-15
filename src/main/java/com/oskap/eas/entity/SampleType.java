package com.oskap.eas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ZNE45571 on 4/15/18.
 */
@Entity
public class SampleType {

    @Id
    @GeneratedValue
    private Long sampleTypeId;

    @Column(nullable = false, unique = true)
    private String sampleTypeName;
    @Column(nullable = false)
    private Long parentSampleTypeId;
    @Column(nullable = false)
    private int handlingTemp;
    @Column(nullable = false)
    private String handlingTempUnit;

    public Long getSampleTypeId() {
        return sampleTypeId;
    }

    public void setSampleTypeId(Long sampleTypeId) {
        this.sampleTypeId = sampleTypeId;
    }

    public String getSampleTypeName() {
        return sampleTypeName;
    }

    public void setSampleTypeName(String sampleTypeName) {
        this.sampleTypeName = sampleTypeName;
    }

    public Long getParentSampleTypeId() {
        return parentSampleTypeId;
    }

    public void setParentSampleTypeId(Long parentSampleTypeId) {
        this.parentSampleTypeId = parentSampleTypeId;
    }

    public int getHandlingTemp() {
        return handlingTemp;
    }

    public void setHandlingTemp(int handlingTemp) {
        this.handlingTemp = handlingTemp;
    }

    public String getHandlingTempUnit() {
        return handlingTempUnit;
    }

    public void setHandlingTempUnit(String handlingTempUnit) {
        this.handlingTempUnit = handlingTempUnit;
    }
}
