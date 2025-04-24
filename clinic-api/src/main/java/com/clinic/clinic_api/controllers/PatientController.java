package com.clinic.clinic_api.controllers;

import com.clinic.clinic_api.models.Patient;
import com.clinic.clinic_api.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping
@CrossOrigin(origins = "*")

public class PatientController {
    @Autowired
    private PatientServices patientServices;
    @GetMapping
    public List<Patient> getAllPatients(){
        return patientServices.getAllPatients();
    }
    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Integer id){
        return patientServices.getPatientById(id);
    }
    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        return patientServices.createPatient(patient);
    }
    @DeleteMapping("{/id}")
    public void deletePatient(@PathVariable Integer id){
        patientServices.deletePatient(id);
    }
}
