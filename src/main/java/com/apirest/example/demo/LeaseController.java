package com.apirest.example.demo;
import com.apirest.example.demo.Lease;
import com.apirest.example.demo.LeasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class LeaseController {
   
    @Autowired
    LeasesRepository leaseRepository;

    @GetMapping("/api/pagos")
    public List<Lease> getAllLeases() {
        return leaseRepository.findAll();
    }

    @PostMapping("/api/pagos")
    public List<Lease> createLease(@Valid @RequestBody Lease lease) {
        return leaseRepository.save(lease);
    }


}








