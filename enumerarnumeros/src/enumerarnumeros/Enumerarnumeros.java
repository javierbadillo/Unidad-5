/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumerarnumeros;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author javie
 */
public class Enumerarnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Array ingresado: " + Arrays.toString(numeros));
        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);

    }
    
}
