package com.apirest.controller;

import com.apirest.model.Lease;
import com.apirest.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1")
public class LeaseController {
   
    @Autowired
    LeaseService leaseService = new LeaseService();

    @GetMapping("/api/pagos")
    public List<Lease> getAllLeases() {
        return leaseService.listAllLeases();
    }

    // @PostMapping("/api/pagos")
    // public void createLease(@RequestBody Lease newLease) {
    //     leaseService.addNewLease(newLease);
    // }

}








