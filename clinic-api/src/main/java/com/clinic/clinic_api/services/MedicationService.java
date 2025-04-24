package com.clinic.clinic_api.services;
import com.clinic.clinic_api.models.Medication;
import com.clinic.clinic_api.repositories.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class MedicationService {
    @Autowired
    private MedicationRepository medicationRepository;

    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }
    public Medication saveMedication(Medication medication) {
        return medicationRepository.save(medication);
    }
}
