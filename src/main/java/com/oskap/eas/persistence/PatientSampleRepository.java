package com.oskap.eas.persistence;

import com.oskap.eas.entity.Patient;
import com.oskap.eas.entity.PatientSample;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by ZNE45571 on 4/16/18.
 */
public interface PatientSampleRepository extends PagingAndSortingRepository<PatientSample,Long> {
}
