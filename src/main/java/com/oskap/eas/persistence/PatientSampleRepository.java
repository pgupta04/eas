package com.oskap.eas.persistence;

import com.oskap.eas.entity.PatientSamples;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by ZNE45571 on 4/16/18.
 */
public interface PatientSampleRepository extends PagingAndSortingRepository<PatientSamples,Long> {
    List<PatientSamples> findByBarcodeContaining(String sampleId);
}
