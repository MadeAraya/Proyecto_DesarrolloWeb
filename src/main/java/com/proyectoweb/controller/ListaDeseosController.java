/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoweb.controller;

import com.proyectoweb.domain.ListaDeseos;
import com.proyectoweb.service.ListaDeseosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ListaDeseosController {

    @Autowired
    private ListaDeseosService listaDeseosService;

    @GetMapping("/listaDeseos")
    public String mostrarListaDeseos(Model model) {
        List<ListaDeseos> listaDeseos = listaDeseosService.obtenerTodos();
        model.addAttribute("listaDeseos", listaDeseos);
        return "listaDeseos/listaDeseos";
    }
}

