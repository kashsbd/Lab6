package edu.miu.prakash.ads.service;

import edu.miu.prakash.ads.model.Dentist;

import java.util.List;

public interface DentistService {
    Dentist saveDentist(Dentist dentist);

    List<Dentist> getAllDentists();

    Dentist getDentistById(Integer dentistId);

    Dentist updateDentist(Dentist dentist);

    void deleteDentistById(Integer dentistId);
}
