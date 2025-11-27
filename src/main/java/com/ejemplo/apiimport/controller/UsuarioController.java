package com.ejemplo.apiimport.controller;

import com.ejemplo.apiimport.model.Usuario;
import com.ejemplo.apiimport.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService service;
    @PostMapping(value = "/register")
    public Usuario register(@RequestBody Usuario user) {
        return service.register(user);
    }

    @GetMapping("/usuario/{nombreusuario}")
    public ResponseEntity<Usuario> getByNombre(@PathVariable String nombreusuario) {
        Usuario usuario = service.findByNombreUsuario(nombreusuario);
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }


}
