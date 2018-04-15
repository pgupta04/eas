package com.oskap.eas.persistence;

import com.oskap.eas.entity.SampleType;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by ZNE45571 on 4/15/18.
 */
public interface SampleTypeRepository extends PagingAndSortingRepository<SampleType,Long> {
    List<SampleType> findByParentSampleTypeId(Long aLong);
}
