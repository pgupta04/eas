package com.oskap.eas.persistence;

import com.oskap.eas.entity.Patient;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by ZNE45571 on 4/14/18.
 */
public interface PatientRepository extends PagingAndSortingRepository<Patient,Long> {
    Patient findByPatientId(Long productId);
}
