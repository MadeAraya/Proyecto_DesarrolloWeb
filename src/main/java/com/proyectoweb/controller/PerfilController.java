/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Made Araya
 */
@Controller
public class PerfilController {

    @GetMapping("/perfil")
    public String mostrarUsuario() {
        return "perfil/usuario"; 
    }
}

