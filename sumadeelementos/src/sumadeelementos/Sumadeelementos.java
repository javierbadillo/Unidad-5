/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadeelementos;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author javie
 */
public class Sumadeelementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("Array ingresado: " + Arrays.toString(numeros));
        System.out.println("La suma de los elementos es: " + suma);
    }
    
}
