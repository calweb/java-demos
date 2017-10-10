package org.theironyard.jpadbintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.theironyard.jpadbintro.model.Email;

public interface EmailRepository extends JpaRepository<Email, Integer> {
}
