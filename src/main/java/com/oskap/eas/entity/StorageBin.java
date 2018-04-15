package com.oskap.eas.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ZNE45571 on 4/15/18.
 */
@Entity
public class StorageBin {

    @Id
    @GeneratedValue
    private long storageBinId;

    @Column(nullable = false)
    private String storageBinName;

    public long getStorageBinId() {
        return storageBinId;
    }

    public void setStorageBinId(long storageBinId) {
        this.storageBinId = storageBinId;
    }

    public String getStorageBinName() {
        return storageBinName;
    }

    public void setStorageBinName(String storageBinName) {
        this.storageBinName = storageBinName;
    }
}
