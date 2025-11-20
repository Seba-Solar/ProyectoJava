package com.ejemplo.apiimport.controller;

import com.ejemplo.apiimport.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping(value = "/usuario/{nombreUsuario}")
    public Usuario postTestData(@PathVariable String nombreUsuario) {
        Usuario usuario = new Usuario();
        usuario.setNombreusuario(nombreUsuario);
        return usuario;
    }

}
