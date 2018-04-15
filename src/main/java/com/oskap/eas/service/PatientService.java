package com.oskap.eas.service;

import com.oskap.eas.entity.Patient;
import com.oskap.eas.persistence.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by ZNE45571 on 4/14/18.
 */
@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public List<Patient> findAll() {
        List<Patient> patients = (List<Patient>) patientRepository.findAll();
        return patients;
    }

    public Patient get(String productId) {
/*
        Patient patient = new Patient();
        patient.setName("Parveen");
        patient.setDateOfBirth(new Date());
        patientRepository.save(patient);
*/
        Patient patient = patientRepository.findByPatientId(Long.valueOf(productId));
        return patient;
    }

    public void delete(Long patientId) {
        patientRepository.delete(patientId);
    }

    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    public void update(Patient product) {

    }
}
