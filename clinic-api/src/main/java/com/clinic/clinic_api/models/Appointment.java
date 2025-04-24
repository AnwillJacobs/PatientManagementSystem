package com.clinic.clinic_api.models;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "appointments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;

    @ManyToOne
    @JoinColumn(name = "patientid")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctorid")
    private Doctor doctor;

    @Column(name = "appointmentdate")
    private Date appointmentdate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AppointmentStatus status;
    public enum AppointmentStatus {
        SCHEDULED,COMPLETED,CANCELED
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }
    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Date getAppointmentdate() {
        return appointmentdate;
    }
    public void setAppointmentdate(Date appointmentdate) {
        this.appointmentdate = appointmentdate;
    }
    public AppointmentStatus getStatus() {
        return status;
    }
    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }
}

