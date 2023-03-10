/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import com.entity.Sala;
import com.repository.SalaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Arturo
 */
@Service
public class SalaService implements ISalaService{
    @Autowired
    private SalaRepository salaRepository;
    
    public List<Sala> listCountry(){
        return (List<Sala>)salaRepository.findAll();
    }

    @Override
    public List<Sala> listRoom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}