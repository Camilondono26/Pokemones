/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.equiporocket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquipoRocket {

    public static void main(String[] args) {
        // Llamamos al menú principal al iniciar la aplicación
        menuPrincipal();
    }

    // Menú principal
    public static void menuPrincipal() {
        Scanner lector = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal");
            System.out.println("Simulador de Batallas Pokémon");
            System.out.println("1. Gestionar Entrenadores");
            System.out.println("2. Gestionar Pokémones");
            System.out.println("3. Iniciar Batalla");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    gestionarEntrenadores(lector);  
                    break; 
                case 2:
                    gestionarPokemones(lector);  
                    break;
                case 3:
                    iniciarBatalla(lector);  
                    break;
                case 4:
                    System.out.println("Saliendo... ¡Hasta luego!");
                    break;  
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 4);  
    }

    // Submenú para gestionar entrenadores
    private static void gestionarEntrenadores(Scanner lector) {

        List<Entrenador> entrenadores = new ArrayList<>();

        int opcionMenu1;

        do {
            System.out.println("\nSubmenú 1: Gestionar Entrenadores");
            System.out.println("1. Registrar nuevo entrenador");
            System.out.println("2. Ver lista de entrenadores");
            System.out.println("3. Seleccionar un entrenador");
            System.out.println("4. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            opcionMenu1 = lector.nextInt();  

            switch (opcionMenu1) {
                case 1:
                    registrarEntrenador(lector, entrenadores);
                    break;
                case 2:
                    verListaEntrenadores(entrenadores);
                    break;
                case 3:
                    seleccionarEntrenador(lector, entrenadores);
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcionMenu1 != 4); 
    }

    // Submenú para gestionar Pokémones
    private static void gestionarPokemones(Scanner lector) {
        int opcionMenu2;

        do {
            System.out.println("Submenú 2: Gestionar Pokémones");
            System.out.println("1. Ver todos los Pokémones registrados");
            System.out.println("2. Registrar nuevo Pokémon");
            System.out.println("3. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            List<Pokemon> pokemones = new ArrayList<>();
            opcionMenu2 = lector.nextInt();  

            switch (opcionMenu2) {
                case 1:
                    verTodosPokemones(pokemones);
                    break;  
                case 2:
                    registrarPokemon(lector, pokemones);
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcionMenu2 != 3);  
    }

    private static void iniciarBatalla(Scanner lector) {
        int opcionMenu3;

        do {
            System.out.println("Submenú 3: Iniciar Batalla");
            System.out.println("1. Elegir entrenador 1");
            System.out.println("2. Elegir entrenador 2");
            System.out.println("3. Seleccionar Pokémon de entrenador 1");
            System.out.println("4. Seleccionar Pokémon de entrenador 2");
            System.out.println("5. Comenzar batalla");
            System.out.println("6. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            opcionMenu3 = lector.nextInt();  

            switch (opcionMenu3) {
                case 1:
                    System.out.println("Elegir entrenador 1");
                    break;  
                case 2:
                    System.out.println("Elegir entrenador 2");
                    break;
                case 3:
                    System.out.println("Seleccionar Pokémon de entrenador 1");
                    break;  
                case 4:
                    System.out.println("Seleccionar Pokémon de entrenador 2");
                    break;
                case 5:
                    System.out.println("Comenzar batalla");
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcionMenu3 != 6);  
    }

    private static void registrarEntrenador(Scanner lector, List<Entrenador> entrenadores) {

        System.out.println("Ingrese el nombre del entrenador:");
        lector.nextLine();
        String nombre = lector.nextLine();
        List<Pokemon> pokemones = new ArrayList<>();
        Entrenador nuevoEntrenador = new Entrenador(nombre, pokemones);
        entrenadores.add(nuevoEntrenador);
        System.out.println("Entrenador " + nombre + " registrado exitosamente.");
    }

    private static void verListaEntrenadores(List<Entrenador> entrenadores) {
        System.out.println("Lista de Entrenadores:");
        for (Entrenador entrenador : entrenadores) {
            System.out.println("- " + entrenador.getNombre());
        }
    }

    private static void seleccionarEntrenador(Scanner lector, List<Entrenador> entrenadores) {
        System.out.print("Introduce el nombre del entrenador a seleccionar: ");
        lector.nextLine();
        String nombre = lector.nextLine();

        Entrenador entrenadorSeleccionado = null;

        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getNombre().equals(nombre)) {
                entrenadorSeleccionado = entrenador;
            }
        }
        if (entrenadorSeleccionado != null) {
            System.out.println("Entrenador seleccionado: " + entrenadorSeleccionado.getNombre());
        } else {
            System.out.println("No se encontró un entrenador con ese nombre.");
        }
    }

    private static void verTodosPokemones(List<Pokemon> pokemones) {
       System.out.println("Lista de Pokémones:");
       for (Pokemon pokemon : pokemones) {
           System.out.println("- " + pokemon.getNombre());
       }
    }

    private static void registrarPokemon(Scanner lector, List<Pokemon> pokemones) {
   System.out.print("Introduce el nombre del Pokémon: ");
    String nombre = lector.next();
    System.out.print("Introduce el tipo del Pokémon (e.g., Fuego, Agua): ");
    String tipo = lector.next();
    pokemones.add(new pokemon(nombre, tipo)); // Ajusta el constructor según la clase Pokemon
    System.out.println("Pokémon registrado correctamente.");
    }

}
 