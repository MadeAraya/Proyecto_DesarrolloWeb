/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Genn
 */
@Controller
public class BellezaController {
    
    @GetMapping("/belleza")
    public String mostrarBelleza() {
        return "/belleza/belleza"; 
    }
}
