package com.clinic.clinic_api.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="doctors")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer doctorId;
    private String name;
    private String specialisation;
    private String email;
    private String phone;
}
