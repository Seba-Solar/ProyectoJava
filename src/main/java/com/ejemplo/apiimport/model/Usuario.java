package com.ejemplo.apiimport.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private long idusuario;
        private String nombreusuario;
    private String correousuario;
    private String apellidousuario;
    private String pwusuario;

    private Boolean codigoVerificacion = false;

    public Usuario() {
    }

    public Usuario(long idusuario, String nombreusuario, String correousuario, String apellidousuario, String pwusuario, Boolean codigoVerificacion) {
        this.idusuario = idusuario;
        this.nombreusuario = nombreusuario;
        this.correousuario = correousuario;
        this.apellidousuario = apellidousuario;
        this.pwusuario = pwusuario;
        this.codigoVerificacion = codigoVerificacion;
    }

    public Boolean getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(Boolean codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    public boolean isEnabled( Boolean codigoVerificacion) { return codigoVerificacion; }

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getCorreousuario() {
        return correousuario;
    }

    public void setCorreousuario(String correousuario) {
        this.correousuario = correousuario;
    }

    public String getApellidousuario() {
        return apellidousuario;
    }

    public void setApellidousuario(String apellidousuario) {
        this.apellidousuario = apellidousuario;
    }

    public String getPwusuario() {
        return pwusuario;
    }

    public void setPwusuario(String pwusuario) {
        this.pwusuario = pwusuario;
    }
}
