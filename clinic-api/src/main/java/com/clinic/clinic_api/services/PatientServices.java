package com.clinic.clinic_api.services;

import com.clinic.clinic_api.models.Patient ;
import com.clinic.clinic_api.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service

public class PatientServices {
    @Autowired
    private PatientRepository patientRepository;
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
    public Optional<Patient> getPatientById(Integer id){
        return patientRepository.findById(id);
    }
    public Patient createPatient(Patient patient){
        return patientRepository.save(patient);
    }
    public void deletePatient(Integer id){
        patientRepository.deleteById(id);
    }
}
