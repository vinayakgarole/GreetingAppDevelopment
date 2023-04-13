package com.bridgelabz.GreetingAppDevelopment.repository;

import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingAppRepository extends JpaRepository<Greeting, Integer> {
}