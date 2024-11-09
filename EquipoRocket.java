/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equiporocket;

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
                    gestionarEntrenadores(lector);  // Llamamos al menú de entrenadores
                    break; // Es necesario poner un 'break' para evitar el 'fallthrough'
                case 2:
                    gestionarPokemones(lector);  // Llamar al método de gestionar Pokémones
                    break;
                case 3:
                    iniciarBatalla(lector);  // Llamar al método para iniciar una batalla
                    break;
                case 4:
                    System.out.println("Saliendo... ¡Hasta luego!");
                    break;  // Sale del ciclo y termina la ejecución
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 4);  // Este ciclo continuará hasta que se seleccione la opción 4 (Salir)
    }

    // Submenú para gestionar entrenadores
    private static void gestionarEntrenadores(Scanner lector) {
        int opcionMenu1;
        
        do {
            System.out.println("\nSubmenú 1: Gestionar Entrenadores");
            System.out.println("1. Registrar nuevo entrenador");
            System.out.println("2. Ver lista de entrenadores");
            System.out.println("3. Seleccionar un entrenador");
            System.out.println("4. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            opcionMenu1 = lector.nextInt();  // Leemos la opción seleccionada en el submenú

            switch (opcionMenu1) {
                case 1:
                     
                    break;  
                case 2:
                     
                    break;
                case 3:
                   
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;  
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcionMenu1 != 4);  // El submenú se repite hasta que se selecciona la opción 4
    }

    // Submenú para gestionar Pokémones
    private static void gestionarPokemones(Scanner lector) {
       int opcionMenu2;
        
        do {
            System.out.println("Submenú 2: Gestionar Pokémones");
            System.out.println("Gestionar Pokémones");
            System.out.println("1. Ver todos los Pokémones registrados");
            System.out.println("2. Registrar nuevo Pokémon");
            System.out.println("3. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            opcionMenu2 = lector.nextInt();  // Leemos la opción seleccionada en el submenú

            switch (opcionMenu2) {
                case 1:
                   
                    break;  // Se asegura de que el flujo de control se detenga aquí
                case 2:
                   
                    break;
                case 3:
                     System.out.println("Volviendo al menú principal...");
                    break; 
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcionMenu2 != 3);  // El submenú se repite hasta que se selecciona la opción 4
    }

    private static void iniciarBatalla(Scanner lector) {
 int opcionMenu3;
        
        do {
            System.out.println("Submenú 3: Iniciar Batalla");
            System.out.println("Iniciar Batalla");
            System.out.println("1. Elegir entrenador 1");
            System.out.println("2. Elegir entrenador 2");
            System.out.println("3. Seleccionar Pokémon de entrenador 1");
            System.out.println("4. Seleccionar Pokémon de entrenador 2");
            System.out.println("5. Comenzar batalla");
            System.out.println("6. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            opcionMenu3 = lector.nextInt();  // Leemos la opción seleccionada en el submenú

            switch (opcionMenu3) {
                case 1:
                   
                    break;  // Se asegura de que el flujo de control se detenga aquí
                case 2:
                   
                    break;
                case 3:
                     System.out.println("Volviendo al menú principal...");
                    break; 
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcionMenu3 != 3);  // El submenú se repite hasta que se selecciona la opción 4
    }

   
}
