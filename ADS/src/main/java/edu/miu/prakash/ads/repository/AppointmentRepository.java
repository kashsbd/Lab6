package edu.miu.prakash.ads.repository;

import edu.miu.prakash.ads.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
