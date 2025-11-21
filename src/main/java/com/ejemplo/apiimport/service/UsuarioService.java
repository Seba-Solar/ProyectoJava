package com.ejemplo.apiimport.service;

import com.ejemplo.apiimport.model.Usuario;
import com.ejemplo.apiimport.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository userRepository;
    @Autowired
    private SecurityEncrypt securityEncrypt;

    public Usuario register(Usuario user){
        //Encriptacion de la contraseña usando el service
        String rawPassword = user.getPwusuario();
        String encodedPassword = securityEncrypt.encode(rawPassword);
        user.setPwusuario(encodedPassword);
        return userRepository.save(user);
    }
    public Usuario findByNombreUsuario(String nombreusuario) {
        return userRepository.findByNombreusuario(nombreusuario);
    }
}
