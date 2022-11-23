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
public class Ejercicio18 {

    /**
     * Realizar un algoritmo que calcule el salario a pagar de un empleado según los siguientes
parámetros:
• Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y
más Aux. de transporte= +11%.
• Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-
6% y más Aux. de transporte= +9%.
• Si gana más 1.000.000 y menos 1.800.00, descuento por pensión es -6%, descuento de
seguro de vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
• Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%,
descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte=
+8%.
• Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida
6%, descuento de salud =-10% y más Aux. de transporte= +9%.

     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double salario;
        System.out.println("Ingrese su salario ");
        salario = lector.nextDouble();

        if (salario < 700000) {
            salario = salario + ((5 * salario) / 100);

        }
        if (salario >= 741000 && salario <= 999999) {
            salario = salario - ((salario / 100));

        }
        if (salario >= 1000000 && salario < 1800000) {
            salario = salario - ((8 * salario / 100));
        }
        if (salario > 1800000 && salario < 2500000) {
            salario = salario - ((11 * salario / 100));

        }
        if (salario > 2500000) {
            salario = salario - ((15 * salario / 100));
        }
        System.out.println("El salario total es: " + salario);
    }
    
}
