/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equiporocket.Pokemones;

import com.mycompany.equiporocket.EstadoPokemon;
import com.mycompany.equiporocket.Pokemon;
import com.mycompany.equiporocket.TipoPokemon;

/**
 *
 * @author USUARIO
 */
public class Paras extends Pokemon {
    
    public Paras(String nombre, double salud, double puntosDeAtaque, TipoPokemon tipo, EstadoPokemon estado) {
        super("Paras", 35, 70, tipo.BICHO_PLANTA, estado.NORMAL);
    }
    
}