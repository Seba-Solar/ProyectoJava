package com.ejemplo.apiimport.controller;

import com.ejemplo.apiimport.model.Usuario;
import com.ejemplo.apiimport.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
 /*
    @GetMapping(value = "/usuario/{usuarioId}")
    public Usuario getTestData(@PathVariable Integer usuarioId) {
        Usuario usuario = new Usuario();
        usuario.setNombreusuario("Carlitos");
        usuario.setApellidousuario("Lechuga");
        usuario.setId(usuarioId);

        return usuario;
    }
*/
    @Autowired
    private UsuarioService service;
    @PostMapping(value = "/register")
    public Usuario register(@RequestBody Usuario user) {

        return service.register(user);
    }

}
