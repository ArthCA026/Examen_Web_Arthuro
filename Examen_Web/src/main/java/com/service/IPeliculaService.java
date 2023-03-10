/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.service;

import com.entity.Pelicula;
import java.util.List;

/**
 *
 * @author Arturo
 */
public interface IPeliculaService {
    public List<Pelicula> getAllPelicula();
    public Pelicula getPeliculaById (long id);
    public void savePelicula(Pelicula pelicula);
    public void delete (long id);
}
