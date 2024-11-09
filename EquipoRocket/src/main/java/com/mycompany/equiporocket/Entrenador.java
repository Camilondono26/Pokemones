/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equiporocket;

import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Entrenador {
    private String nombre;
    private List<Pokemon> pokemones;

    public Entrenador(String nombre, List<Pokemon> pokemones) {
        this.nombre = nombre;
        this.pokemones = pokemones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(List<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }
    
    public void agregarPokemon(Pokemon pokemon) {
        this.pokemones.add(pokemon); 
    }
     public void entrenarPokemon(Pokemon pokemon) {
        
        pokemon.setSalud(pokemon.getSalud() + 5.0);
        pokemon.setPuntosDeAtaque(pokemon.getPuntosDeAtaque() + 3.0);

    }
    public void mostrarPokemones() {
        if (pokemones.isEmpty()) {
            System.out.println("El equipo no tiene Pokémon.");
        } else {
            System.out.println("Pokémon en el equipo de " + this.nombre + ":");
            for (Pokemon pokemon : pokemones) {
                System.out.println("Nombre: " + pokemon.getNombre() + 
                                   " | Salud: " + pokemon.getSalud() + 
                                   " | Ataque: " + pokemon.getPuntosDeAtaque() +
                                   " | Tipo: " + pokemon.getTipo());
            }
        }
    }
    
 
    public Pokemon prepararBatalla(int opcion) {
        if (pokemones.isEmpty()) {
            System.out.println("No tienes Pokémon en tu equipo para la batalla.");
            return null; 
        }
        System.out.println("Selecciona un Pokémon para la batalla:");
        mostrarPokemones();  
   
        if (opcion < 1 || opcion > pokemones.size()) {
            System.out.println("Opción no válida.");
            return null;  
        }
        Pokemon pokemonSeleccionado = pokemones.get(opcion - 1);  // Obtener el Pokémon seleccionado
        System.out.println(pokemonSeleccionado.getNombre() + " está listo para la batalla!");
        return pokemonSeleccionado;  
    }

}
