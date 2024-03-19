/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoweb.controller;

import com.proyectoweb.domain.Anime;
import com.proyectoweb.service.AnimeService;
import com.proyectoweb.service.FirebaseStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Genn
 */
@Controller
@Slf4j

public class AnimeController {
    
    @GetMapping("/anime")
    public String mostrarAnime() {
        return "/anime/anime"; 
    }
    
    @Autowired
    private AnimeService animeService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var animes = animeService.getAnimes(false);
        model.addAttribute("animes", animes);
        model.addAttribute("totalAnimes", animes.size());
        return "/anime/listado";
    }
    
    @GetMapping("/nuevo")
    public String animeNuevo(Anime anime) {
        return "/anime/modifica";
    }

    @Autowired
    private FirebaseStorageService firebaseStorageService;
    
    @PostMapping("/guardar")
    public String animeGuardar(Anime anime,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            animeService.save(anime);
            anime.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "anime", 
                            anime.getIdAnime()));
        }
        animeService.save(anime);
        return "redirect:/anime/listado";
    }

    @GetMapping("/eliminar/{idAnime}")
    public String animeEliminar(Anime anime) {
        animeService.delete(anime);
        return "redirect:/anime/listado";
    }

    @GetMapping("/modifica/{idAnime}")
    public String animeModificar(Anime anime, Model model) {
        anime = animeService.getAnime(anime);
        model.addAttribute("anime", anime);
        return "/anime/modifica";
    }
}