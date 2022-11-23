/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;
import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class Ejercicio16 {

    /**
     * Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente y
mensualmente, si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.
Se debe pedir la cantidad de horas trabajadas y verificar que esté dentro del rango
permitido, también se debe pedir el precio de la hora. Imprimir la cantidad de horas
trabajadas y el pago.
* 
     */
    public static void main(String[] args) {
        double cantH;
        double precH;
        double pago = 0;
        double ganaSem;
        double ganaMes;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresar cantidad de horas trabajadas semanalmente");
        cantH = read.nextDouble();
        if (cantH <= 56 && cantH >= 38) {
            System.out.println("Ingresar el precio por hora");
            precH = read.nextDouble();
            System.out.println("la cantidad de horas trabajadas es de: " + cantH);
            ganaSem = precH * cantH;
            System.out.println("la ganancia semanal es de: " + ganaSem);
            ganaMes = ganaSem * 4;
            System.out.println("la ganancia mensual es de: " + ganaMes);

        } else {
            System.out.println("Revise que las horas esten correctas");
        }

    }
    
}
