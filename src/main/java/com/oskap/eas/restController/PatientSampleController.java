package com.oskap.eas.restController;

import com.oskap.eas.entity.Patient;
import com.oskap.eas.entity.PatientSamples;
import com.oskap.eas.service.PatientSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

/**
 * Created by ZNE45571 on 4/16/18.
 */
@RestController
@RequestMapping("/sample")
public class PatientSampleController {

    @Autowired
    PatientSampleService patientSampleService;

    @GetMapping(value = "/{sample_id}")
    public @ResponseBody
    ResponseEntity<Patient> get(@PathVariable("sample_id") String barcode) {
        return new ResponseEntity(patientSampleService.get(barcode), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Patient> findAll() {
        return new ResponseEntity(patientSampleService.findAll(),HttpStatus.OK);
    }

/*
    @GetMapping(value = "/{patient_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseVO<Patient>> get(@PathVariable("patient_id") String patientId) {
        return ResponseEntity.ok(new ResponseVO<>(patientService.get(patientId)));
    }
*/

    @DeleteMapping(value = "/{sampleId}")
    public ResponseEntity delete(@PathVariable("sampleId") String sampleId) {
        patientSampleService.delete(Long.valueOf(sampleId));
        return new ResponseEntity(sampleId,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody List<PatientSamples> patientSamples) {
        patientSampleService.save(patientSamples);
        return ResponseEntity.created(URI.create("/")).body("success");
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody PatientSamples sample) {
        patientSampleService.update(sample);
        return ResponseEntity.noContent().build();
    }

}
