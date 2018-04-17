package com.oskap.eas.persistence;

import com.oskap.eas.entity.PatientSample;
import com.oskap.eas.entity.SampleUsageHistory;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by ZNE45571 on 4/16/18.
 */
public interface SampleUsageHistoryRepository extends PagingAndSortingRepository<SampleUsageHistory,Long> {

    List<SampleUsageHistory> findByPatientSample(PatientSample patientSample);
}
