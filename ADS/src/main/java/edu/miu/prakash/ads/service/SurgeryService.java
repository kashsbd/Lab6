package edu.miu.prakash.ads.service;

import edu.miu.prakash.ads.model.Surgery;

import java.util.List;

public interface SurgeryService {
    Surgery saveSurgery(Surgery surgery);

    List<Surgery> getAllSurgeries();

    Surgery getSurgeryById(Integer surgeryId);

    Surgery updateSurgery(Surgery surgery);

    void deleteSurgery(Integer surgeryId);

}
