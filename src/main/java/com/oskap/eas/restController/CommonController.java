package com.oskap.eas.restController;

import com.oskap.eas.entity.Patient;
import com.oskap.eas.entity.SampleType;
import com.oskap.eas.entity.StorageBin;
import com.oskap.eas.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

/**
 * Created by ZNE45571 on 4/14/18.
 */
@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    CommonService commonService;

    @GetMapping(value = "/storageBin/{storage_bin_id}")
    public @ResponseBody
    ResponseEntity<List<SampleType>> get(@PathVariable("storage_bin_id") String storageBinId) {
        return new ResponseEntity(commonService.getStorageBin(storageBinId), HttpStatus.OK);
    }

    @GetMapping(value = "/storageBin")
    public ResponseEntity<Patient> findAll() {
        return new ResponseEntity(commonService.findAllStorageBins(),HttpStatus.OK);
    }

    @PostMapping(value = "/storageBin")
    public ResponseEntity create(@RequestBody StorageBin storageBin) {
        StorageBin savedStorageBin = commonService.saveStorageBin(storageBin);
        return ResponseEntity.created(URI.create("/" + storageBin.getStorageBinId())).body(savedStorageBin);
    }

    @DeleteMapping(value = "/storageBin/{storage_bin_id}")
    public ResponseEntity delete(@PathVariable("storage_bin_id") String storageBinId) {
        commonService.deleteStorageBin(Long.valueOf(storageBinId));
        return new ResponseEntity(storageBinId,HttpStatus.OK);
    }

}
