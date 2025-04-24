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
}
