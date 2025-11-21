package com.ejemplo.apiimport.service;

import com.ejemplo.apiimport.model.Usuario;
import com.ejemplo.apiimport.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository userRepository;

    public Usuario register(Usuario user){
        return userRepository.save(user);
    }
}
