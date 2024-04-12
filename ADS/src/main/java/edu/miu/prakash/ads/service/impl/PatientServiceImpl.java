package edu.miu.prakash.ads.service.impl;

import edu.miu.prakash.ads.model.Patient;
import edu.miu.prakash.ads.repository.PatientRepository;
import edu.miu.prakash.ads.service.PatientService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Integer patientId) {
        return patientRepository.findById(patientId).orElse(null);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatientById(Integer patientId) {
        patientRepository.deleteById(patientId);
    }
}
