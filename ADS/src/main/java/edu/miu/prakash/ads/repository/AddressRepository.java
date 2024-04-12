package edu.miu.prakash.ads.repository;


import edu.miu.prakash.ads.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
