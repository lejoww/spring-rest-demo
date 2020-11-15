package com.apirest.service;

import com.apirest.model.Lease;
import com.apirest.repository.LeasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RestController
public class LeaseService {
   
    @Autowired
    private LeasesRepository leaseRepository;

    public List<Lease> listAllLeases() {
        return leaseRepository.findAll();
    }

    // public void addNewLease(Lease lease) {
    //     leaseRepository.save(lease);
    // }
}


