package com.oskap.eas.persistence;

import com.oskap.eas.entity.StorageBin;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by ZNE45571 on 4/15/18.
 */
public interface StorageBinRepository extends PagingAndSortingRepository<StorageBin,Long> {
}
