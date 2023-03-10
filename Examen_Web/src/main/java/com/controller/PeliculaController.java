/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.entity.Sala;
import com.entity.Pelicula;
import com.service.ISalaService;
import com.service.IPeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Arturo
 */
public class PeliculaController {
    @Autowired
    private IPeliculaService peliculaService;
    
    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/pelicula")
    public String index(Model model){
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo","Tabla de Peliculas en Taquilla");
        model.addAttribute("pelicula",listaPelicula);
        return "pelicula";
    }
    @GetMapping("/peliculaN")
    public String crearPersona(Model model){
        List<Sala> listaSalas = salaService.listRoom();
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula){
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
        
    }
    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model){
        Pelicula persona = peliculaService.getPeliculaById(idPelicula);
        List<Sala> listaSalas = salaService.listRoom();
        model.addAttribute("persona", persona);
        model.addAttribute("paises",listaSalas);
        return "crear";
    }
}
