package com.example.security.controllers;

import com.example.security.domain.Phone;
import com.example.security.repos.PhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhoneController {
    private final PhoneRepo phoneRepo;

    @Autowired
    public PhoneController(PhoneRepo phoneRepo){
        this.phoneRepo = phoneRepo;
    }

    @GetMapping("/get/phones")
    public List<Phone> getPhones(){
        return phoneRepo.findAll();
    }

    @PostMapping("/add/phone")
    public Phone addPhone(Phone phone){
        return phoneRepo.save(phone);
    }

}
