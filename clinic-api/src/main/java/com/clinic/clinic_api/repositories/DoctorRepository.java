package com.clinic.clinic_api.repositories;
import com.clinic.clinic_api.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
