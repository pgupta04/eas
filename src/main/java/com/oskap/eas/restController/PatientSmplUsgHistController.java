package com.oskap.eas.restController;

import com.oskap.eas.entity.Patient;
import com.oskap.eas.entity.SampleUsageHistory;
import com.oskap.eas.service.SampleUsageHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ZNE45571 on 4/16/18.
 */
@RestController
@RequestMapping("/sampleHist")
public class PatientSmplUsgHistController {

    @Autowired
    private SampleUsageHistoryService sampleUsageHistoryService;

    @GetMapping(value = "/{sample_id}")
    public @ResponseBody
    ResponseEntity<List<SampleUsageHistory>> get(@PathVariable("sample_id") String sampleId) {
        return new ResponseEntity(sampleUsageHistoryService.get(Long.valueOf(sampleId)), HttpStatus.OK);
    }

    @PostMapping(value = "/turnIn")
    public @ResponseBody
    ResponseEntity<List<SampleUsageHistory>> turnIn(@RequestBody SampleUsageHistory sampleUsageHistory) {
        return new ResponseEntity(sampleUsageHistoryService.turnIn(sampleUsageHistory), HttpStatus.OK);
    }

    @PostMapping(value = "/checkout")
    public @ResponseBody
    ResponseEntity<List<SampleUsageHistory>> checkout(@RequestBody SampleUsageHistory sampleUsageHistory) {
        return new ResponseEntity(sampleUsageHistoryService.checkout(sampleUsageHistory), HttpStatus.OK);
    }

}
