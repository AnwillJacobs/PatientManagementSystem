package com.clinic.clinic_api.controllers;
import com.clinic.clinic_api.models.Medication;
import com.clinic.clinic_api.services.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/medications")
public class MedicationController {
    @Autowired
    private MedicationService medicationService;

    @GetMapping("/")
    public List<Medication> getAllMedications() {
        return medicationService.getAllMedications();
    }
    @PostMapping("/")
    public Medication createMedication(@RequestBody Medication medication) {
        return medicationService.saveMedication(medication);
    }
}
