/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoweb.service.impl;

import com.proyectoweb.dao.AnimeDao;
import com.proyectoweb.domain.Anime;
import com.proyectoweb.service.AnimeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USUARIO
 */
@Service
public class AnimeServiceImpl implements AnimeService {
    
    @Autowired
    private AnimeDao animeDao;

    @Override
    @Transactional(readOnly=true)
    public List<Anime> getAnimes(boolean activos) {
        var lista=animeDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Anime getAnime(Anime anime) {
        return animeDao.findById(anime.getIdAnime()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Anime anime) {
        animeDao.save(anime);
    }

    @Override
    @Transactional
    public void delete(Anime anime) {
        animeDao.delete(anime);
    }
}