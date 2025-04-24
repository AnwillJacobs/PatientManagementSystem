package com.clinic.clinic_api.repositories;
import com.clinic.clinic_api.models.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication,Integer> {
}
