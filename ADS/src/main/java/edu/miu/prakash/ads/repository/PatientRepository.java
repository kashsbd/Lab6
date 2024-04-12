package edu.miu.prakash.ads.repository;

import edu.miu.prakash.ads.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
