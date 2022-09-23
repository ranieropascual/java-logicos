/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1.pkg2;

import java.util.Scanner;

/**
 *
 * @author Windows 10 Pro
 */
public class Ejercicio1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
          System.out.println("Ingrese su edad: ");
        Scanner edad = new Scanner(System.in);
        
         num = edad.nextInt();
        System.out.println("el anio que viene tendras: " +num ++);
    }
    
}
