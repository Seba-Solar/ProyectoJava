package com.ejemplo.apiimport.service;


import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.*;

@Service
public class SecurityEncrypt {
    private BCryptPasswordEncoder encoder;

    public SecurityEncrypt() {
        this.encoder = new BCryptPasswordEncoder(10);
    }

    public String encode(String rawPassword) {
        return encoder.encode(rawPassword);
    }
}
