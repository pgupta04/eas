package com.oskap.eas.service;

import com.oskap.eas.entity.SampleType;
import com.oskap.eas.persistence.SampleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.List;

/**
 * Created by ZNE45571 on 4/15/18.
 */
@Service
public class SampleService {

    @Autowired
    SampleTypeRepository sampleTypeRepository;

    public List<SampleType> get(String parentId) {

        return sampleTypeRepository.findByParentSampleTypeId(Long.valueOf(parentId));
    }

    public List<SampleType> findAll() {
        return (List<SampleType>)sampleTypeRepository.findAll();
    }

    public void delete(Long sampleTypeId) {
        sampleTypeRepository.delete(sampleTypeId);
    }

    public SampleType save(SampleType sampleType) {
        return sampleTypeRepository.save(sampleType);
    }

    public void update(SampleType sampleType) {

    }
}
