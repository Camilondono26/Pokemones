/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equiporocket;

/**
 *
 * @author USUARIO
 */
public class Batalla {
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
       
        
        
        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
           
            atacar(pokemon1, pokemon2);
            if (pokemon2.getSalud() > 0) {
                atacar(pokemon2, pokemon1);
            }
        }
        
        if (pokemon1.getSalud() <= 0 && pokemon2.getSalud() <= 0) {
            System.out.println("La batalla terminó en empate.");
        } else if (pokemon1.getSalud() <= 0) {
            System.out.println(pokemon2.getNombre() + " ha ganado la batalla!");
        } else {
            System.out.println(pokemon1.getNombre() + " ha ganado la batalla!");
        }
    }

    
    public void atacar(Pokemon atacante, Pokemon defensor) {
        
        double multiplicador = atacante.getTipo().obtenerMultiplicadorDeDanio(defensor.getTipo());
        double dano = atacante.getPuntosDeAtaque();
        defensor.setSalud(defensor.getSalud() - dano);  // Reducir la salud del defensor por el daño recibido
        
        // Mostrar el resultado del ataque
        System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " causando " + dano + " puntos de daño.");
        System.out.println(defensor.getNombre() + " - Salud restante: " + defensor.getSalud());
    }
}
