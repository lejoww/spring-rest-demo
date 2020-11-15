package com.apirest.example.demo;

import com.apirest.example.demo.Lease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeasesRepository extends JpaRepository<Lease, Long> {
    
}