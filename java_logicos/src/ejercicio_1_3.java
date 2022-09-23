/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10 Pro
 */
import java.util.Scanner;


public class ejercicio_1_3 {
    
    public static void main(String[] args){
        int aActual;
        int aNacimiento;
        int edad;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("anio de nacimiento: ");
        aNacimiento = sc.nextInt();
        System.out.print("anio actual: ");
        aActual = sc.nextInt();
        
        edad = aActual - aNacimiento;
        
        System.out.println("su edad es de: " + edad + " anios.");
    }
}
