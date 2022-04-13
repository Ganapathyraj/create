package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepo  extends JpaRepository<ManagerEntity, Integer> {
}


