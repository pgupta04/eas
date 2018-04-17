package com.oskap.eas.service;

import com.oskap.eas.entity.StorageBin;
import com.oskap.eas.persistence.StorageBinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.List;

/**
 * Created by ZNE45571 on 4/15/18.
 */
@Service
public class CommonService {

    @Autowired
    StorageBinRepository storageBinRepository;

    public StorageBin getStorageBin(String storageBinId) {
        return storageBinRepository.findOne(Long.valueOf(storageBinId));
    }

    public List<StorageBin> findAllStorageBins() {
        return (List<StorageBin>)storageBinRepository.findAll();
    }

    public StorageBin saveStorageBin(List<StorageBin> storageBins) {
        for(StorageBin storageBin:storageBins){
            storageBinRepository.save(storageBin);
        }
        return null;
    }

    public void deleteStorageBin(Long storageBinId) {
        storageBinRepository.delete(storageBinId);
    }
}
