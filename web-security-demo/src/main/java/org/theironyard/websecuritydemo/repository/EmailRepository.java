package org.theironyard.websecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.theironyard.websecuritydemo.model.Email;

public interface EmailRepository extends JpaRepository<Email, Integer> {
}
