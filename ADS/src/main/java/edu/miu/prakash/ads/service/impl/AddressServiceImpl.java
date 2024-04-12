package edu.miu.prakash.ads.service.impl;

import edu.miu.prakash.ads.model.Address;
import edu.miu.prakash.ads.repository.AddressRepository;
import edu.miu.prakash.ads.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Integer addressId) {
        return addressRepository.findById(addressId).orElse(null);
    }

    @Override
    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddressById(Integer addressId) {
        addressRepository.deleteById(addressId);
    }
}
