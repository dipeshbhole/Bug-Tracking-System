package com.example.demo.bugtrackingsystem.repository;

import com.example.demo.bugtrackingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
