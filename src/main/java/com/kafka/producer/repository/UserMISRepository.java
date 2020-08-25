package com.kafka.producer.repository;

import com.kafka.producer.model.UserMIS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMISRepository extends JpaRepository<UserMIS, Integer> {
}
