package edu.miu.prakash.ads.service;

import edu.miu.prakash.ads.model.Patient;

import java.util.List;

public interface PatientService {
    Patient savePatient(Patient patient);

    List<Patient> getAllPatient();

    Patient getPatientById(Integer patientId);

    Patient updatePatient(Patient patient);

    void deletePatientById(Integer patientId);
}
