package com.apirest.repository;

import com.apirest.model.Lease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeasesRepository extends JpaRepository<Lease, Integer> {
    
}