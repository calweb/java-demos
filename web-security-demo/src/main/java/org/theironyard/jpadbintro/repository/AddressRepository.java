package org.theironyard.jpadbintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.theironyard.jpadbintro.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
