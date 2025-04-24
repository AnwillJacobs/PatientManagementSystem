package com.clinic.clinic_api.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "patients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer patient_id;
    private String email;
    private String phone;
    private String address;

    @Column(name = "dob")
    private String dob;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public enum Gender {
        MALE, FEMALE, OTHER;
    }
}
