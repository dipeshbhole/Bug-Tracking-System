package com.example.demo.bugtrackingsystem.repository;

import com.example.demo.bugtrackingsystem.model.Bug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BugRepository extends JpaRepository<Bug, Long> {
}
