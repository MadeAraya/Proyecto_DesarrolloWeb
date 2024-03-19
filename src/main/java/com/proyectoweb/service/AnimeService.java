/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoweb.service;

import com.proyectoweb.domain.Anime;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface AnimeService {
    
    
    // Se obtiene un listado de animes en un List    
    public List<Anime> getAnimes(boolean activos);
    
    // Se obtiene un Anime, a partir del id de un anime
    public Anime getAnime(Anime anime);
    
    // Se inserta un nuevo anime si el id del anime esta vacío
    // Se actualiza un anime si el id del anime NO esta vacío
    public void save(Anime anime);
    
    // Se elimina el anime que tiene el id pasado por parámetro
    public void delete(Anime anime);



}
