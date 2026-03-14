package com.aiblog.service;

import com.aiblog.model.Admin;
import com.aiblog.repository.AdminRepository;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public boolean authenticate(String username, String password) {

        Optional<Admin> admin = adminRepository.findByUsername(username);

        if(admin.isPresent()) {

            return admin.get().getPassword().equals(password);

        }

        return false;

    }

}