/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_byronlemuz;

import java.util.Scanner;

/**
 *
 * @author lesly
 */
public class Lab3P1_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("------------Menú de Ejercicios\n -------------");
            System.out.println("1. Figura con tamaño y caracter");
            System.out.println("2. Aproximación a pi");
            System.out.println("3. Casa con tamaño");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tamaño de la figura (entre 4 y 16): ");
                    int n = sc.nextInt();
                    while (n < 4 || n > 16) {
                        System.out.print("Tamaño inválido. Ingrese el tamaño de la figura: ");
                        n = sc.nextInt();
                    }

                    System.out.print("Ingrese el caracter para el triángulo superior: ");
                    char c = sc.next().charAt(0);

                    // Construcción de la figura
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(c + " ");
                        }
                        System.out.println();
                    }

                    for (int i = n - 1; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(c + " ");
                        }
                        System.out.println();
                    }
                    // Llamar a la función que crea la figura con tamaño y caracter
                    break;

                case 2:
                    System.out.print("Ingrese el límite de la sumatoria: ");
                    int k = sc.nextInt();
                    double approximation = 0;
                    for (int i = 0; i <= k; i++) {
                        approximation += Math.pow(-1, i) / (2 * i + 1);
                    }
                    approximation *= 4;
                    System.out.println("La aproximación es: " + approximation);

                    // Aqui llamo a la función que hace la aproximación a pi
                    break;
                case 3:
                    System.out.print("Ingrese el tamaño de la figura: ");
                    int tamaño = sc.nextInt();
                    if (tamaño <= 4) {
                        System.out.println("El tamaño debe ser mayor a 4");
                    } else {
                        for (int i = 1; i <= 2 * tamaño; i++) {
                            for (int j = 1; j <= tamaño; j++) {
                                if (i <= tamaño / 2) {
                                    System.out.print(" ");
                                } else if (i > tamaño / 2 && i < tamaño) {
                                    System.out.print("/");
                                } else if (i >= tamaño && i < tamaño + (tamaño / 2)) {
                                    System.out.print("\\");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    // Aqui llamo a la función que crea la casa con tamaño
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        }
    }
}
