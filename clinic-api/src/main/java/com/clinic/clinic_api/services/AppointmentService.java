package com.clinic.clinic_api.services;
import com.clinic.clinic_api.models.Appointment;
import com.clinic.clinic_api.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }
    public Optional<Appointment> getAppointmentById(Integer id) {
        return appointmentRepository.findById(id);
    }
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
    public void deleteAppointment(Integer id) {
        appointmentRepository.deleteById(id);
    }
    public List<Appointment> findAppointmentByPatientId(Integer id) {
        return appointmentRepository.findAll();
    }
}
