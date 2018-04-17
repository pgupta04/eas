package com.oskap.eas.service;

import com.oskap.eas.entity.PatientSample;
import com.oskap.eas.entity.SampleUsageHistory;
import com.oskap.eas.persistence.PatientSampleRepository;
import com.oskap.eas.persistence.SampleUsageHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.Date;
import java.util.List;

/**
 * Created by ZNE45571 on 4/16/18.
 */
@Service
public class SampleUsageHistoryService {

    @Autowired
    SampleUsageHistoryRepository sampleUsageHistoryRepository;

    @Autowired
    PatientSampleRepository patientSampleRepository;

    public List<SampleUsageHistory> get(Long patientSampleId) {
        PatientSample patientSample = new PatientSample();
        patientSample.setPatientSampleId(patientSampleId);
        return sampleUsageHistoryRepository.findByPatientSample(patientSample);
    }

    public SampleUsageHistory turnIn(SampleUsageHistory sampleUsageHistory) {
        sampleUsageHistory.setTurnInDate(new Date());
        return sampleUsageHistoryRepository.save(sampleUsageHistory);
    }

    public SampleUsageHistory checkout(SampleUsageHistory sampleUsageHistory) {
        sampleUsageHistory.setIssuedDate(new Date());
        return sampleUsageHistoryRepository.save(sampleUsageHistory);
    }
}
