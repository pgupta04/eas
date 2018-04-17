package com.oskap.eas.restController;

import com.oskap.eas.entity.Patient;
import com.oskap.eas.entity.PatientSample;
import com.oskap.eas.service.PatientSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

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
    ResponseEntity<Patient> get(@PathVariable("sample_id") String sampleId) {
        return new ResponseEntity(patientSampleService.get(Long.valueOf(sampleId)), HttpStatus.OK);
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
    public ResponseEntity create(@RequestBody PatientSample patientSample) {
        PatientSample savedPatientSample = patientSampleService.save(patientSample);
        return ResponseEntity.created(URI.create("/" + savedPatientSample.getPatientSampleId())).body(savedPatientSample);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody PatientSample sample) {
        patientSampleService.update(sample);
        return ResponseEntity.noContent().build();
    }

}
