package com.example.security.repos;

import com.example.security.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepo extends JpaRepository<Phone, Long> {
}
