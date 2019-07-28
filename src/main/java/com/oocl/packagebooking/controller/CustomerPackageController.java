package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.entity.CustomerPackage;
import com.oocl.packagebooking.repository.CustomerPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/packages")
public class CustomerPackageController {
    @Autowired
    private CustomerPackageRepository customerPackageRepository;
    @PostMapping
    public CustomerPackage addPackageInformation(@RequestBody CustomerPackage package1){
        return customerPackageRepository.save(package1);
    }
    @GetMapping
    public List<CustomerPackage> getpackageInformation(){
        return customerPackageRepository.findAll();
    }
    @DeleteMapping
    public  void deletePackageInformation(){
        customerPackageRepository.deleteAll();
    }
}
