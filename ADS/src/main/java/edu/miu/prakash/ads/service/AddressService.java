package edu.miu.prakash.ads.service;

import edu.miu.prakash.ads.model.Address;

import java.util.List;

public interface AddressService {
    Address saveAddress(Address address);

    List<Address> getAllAddress();

    Address getAddressById(Integer addressId);

    Address updateAddress(Address address);

    void deleteAddressById(Integer addressId);
}
