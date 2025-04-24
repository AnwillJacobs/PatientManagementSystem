package com.clinic.clinic_api.repositories;
import com.clinic.clinic_api.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
}
