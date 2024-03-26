/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoweb.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class ListaDeseos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLista;
    
    private Long idUsuario;
    
    private Long idProducto;
    
    private Long idSubcategoria;
    
    private String rutaImagen;

    public ListaDeseos() {
    }

    public ListaDeseos(Long idLista, Long idUsuario, Long idProducto, Long idSubcategoria, String rutaImagen) {
        this.idLista = idLista;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.idSubcategoria = idSubcategoria;
        this.rutaImagen = rutaImagen;
    }

    public Long getIdLista() {
        return idLista;
    }

    public void setIdLista(Long idLista) {
        this.idLista = idLista;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(Long idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    
}




