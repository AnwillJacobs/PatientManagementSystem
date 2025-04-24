package com.clinic.clinic_api.models;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "medication")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer medicationid;

    @Column(nullable = false)
    private String name;

    private String dosage;
    private String instructions;

    public Integer getMedicationid() {
        return medicationid;
    }
    public void setMedicationid(Integer medicationid) {
        this.medicationid = medicationid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDosage() {
        return dosage;
    }
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    public String getInstructions() {
        return instructions;
    }
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
