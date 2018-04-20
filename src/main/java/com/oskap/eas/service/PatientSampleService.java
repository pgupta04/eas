package com.oskap.eas.service;

import com.oskap.eas.entity.PatientSamples;
import com.oskap.eas.persistence.PatientSampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZNE45571 on 4/16/18.
 */
@Service
public class PatientSampleService {

    @Autowired
    PatientSampleRepository patientSampleRepository;

    public List<PatientSamples> get(String barcode) {
        return (List<PatientSamples>) patientSampleRepository.findByBarcodeContaining(barcode);
    }

    public List<PatientSamples> findAll() {
        return (List<PatientSamples>) patientSampleRepository.findAll();
    }

    public void delete(Long aLong) {
        patientSampleRepository.delete(aLong);
    }

    public PatientSamples save(List<PatientSamples> patientSamples) {
        for(PatientSamples patientSample:patientSamples) {
            patientSampleRepository.save(patientSample);
        }
        return null;
    }

    public void update(PatientSamples sample) {

    }
}
