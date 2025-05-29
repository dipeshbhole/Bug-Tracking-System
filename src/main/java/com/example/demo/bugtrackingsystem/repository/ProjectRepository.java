package com.example.demo.bugtrackingsystem.repository;

import com.example.demo.bugtrackingsystem.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
