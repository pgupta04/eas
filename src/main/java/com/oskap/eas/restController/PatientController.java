package com.oskap.eas.restController;

import com.oskap.eas.entity.Patient;
import com.oskap.eas.service.PatientService;
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
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping(value = "/{patient_id}")
    public @ResponseBody ResponseEntity<Patient> get(@PathVariable("patient_id") String patientId) {
        return new ResponseEntity(patientService.get(patientId),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Patient> findAll() {
        return new ResponseEntity(patientService.findAll(),HttpStatus.OK);
    }

/*
    @GetMapping(value = "/{patient_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseVO<Patient>> get(@PathVariable("patient_id") String patientId) {
        return ResponseEntity.ok(new ResponseVO<>(patientService.get(patientId)));
    }
*/

    @DeleteMapping(value = "/{patient_id}")
    public ResponseEntity delete(@PathVariable("patient_id") String productId) {
        patientService.delete(Long.valueOf(productId));
        return new ResponseEntity(productId,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody List<Patient> patients) {
        patientService.save(patients);
        return ResponseEntity.created(URI.create("/" )).body("success");
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody Patient patient) {
        patientService.update(patient);
        return ResponseEntity.noContent().build();
    }
}
