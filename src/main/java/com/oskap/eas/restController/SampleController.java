package com.oskap.eas.restController;

import com.oskap.eas.entity.Patient;
import com.oskap.eas.entity.SampleType;
import com.oskap.eas.service.PatientService;
import com.oskap.eas.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

/**
 * Created by ZNE45571 on 4/14/18.
 */
@RestController
@RequestMapping("/sampleType")
public class SampleController {


    @Autowired
    SampleService sampleService;

    @GetMapping(value = "/{parent_id}")
    public @ResponseBody
    ResponseEntity<List<SampleType>> get(@PathVariable("parent_id") String parentId) {
        return new ResponseEntity(sampleService.get(parentId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Patient> findAll() {
        return new ResponseEntity(sampleService.findAll(),HttpStatus.OK);
    }

/*
    @GetMapping(value = "/{patient_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseVO<Patient>> get(@PathVariable("patient_id") String patientId) {
        return ResponseEntity.ok(new ResponseVO<>(patientService.get(patientId)));
    }
*/

    @DeleteMapping(value = "/{sampleType_id}")
    public ResponseEntity delete(@PathVariable("sampleType_id") String sampleTypeId) {
        sampleService.delete(Long.valueOf(sampleTypeId));
        return new ResponseEntity(sampleTypeId,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody SampleType sampleType) {
        SampleType savedSampleType = sampleService.save(sampleType);
        return ResponseEntity.created(URI.create("/" + sampleType.getSampleTypeId())).body(savedSampleType);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody SampleType sampleType) {
        sampleService.update(sampleType);
        return ResponseEntity.noContent().build();
    }

}
