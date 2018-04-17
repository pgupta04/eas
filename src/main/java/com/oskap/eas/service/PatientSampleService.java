package com.oskap.eas.service;

import com.oskap.eas.entity.PatientSample;
import com.oskap.eas.persistence.PatientSampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.List;

/**
 * Created by ZNE45571 on 4/16/18.
 */
@Service
public class PatientSampleService {

    @Autowired
    PatientSampleRepository patientSampleRepository;

    public List<PatientSample> get(Long sampleId) {
        return (List<PatientSample>) patientSampleRepository.findOne(sampleId);
    }

    public List<PatientSample> findAll() {
        return (List<PatientSample>) patientSampleRepository.findAll();
    }

    public void delete(Long aLong) {
        patientSampleRepository.delete(aLong);
    }

    public PatientSample save(PatientSample patientSample) {
        PatientSample savedPatientSample = patientSampleRepository.save(patientSample);
        return savedPatientSample;
    }

    public void update(PatientSample sample) {

    }
}
