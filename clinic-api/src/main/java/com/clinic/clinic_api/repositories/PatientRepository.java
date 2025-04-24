package com.clinic.clinic_api.repositories;

import com.clinic.clinic_api.models.Patient ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
}
