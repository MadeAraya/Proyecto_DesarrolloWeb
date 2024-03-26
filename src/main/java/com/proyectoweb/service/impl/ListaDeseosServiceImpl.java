/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoweb.service.impl;

import com.proyectoweb.dao.ListaDeseosDao;
import com.proyectoweb.domain.ListaDeseos;
import com.proyectoweb.service.ListaDeseosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ListaDeseosServiceImpl implements ListaDeseosService {

    @Autowired
    private ListaDeseosDao listaDeseosDao;

    @Override
    public List<ListaDeseos> obtenerTodos() {
        return listaDeseosDao.findAll();
    }
}


