package org.theironyard.websecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.theironyard.websecuritydemo.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
