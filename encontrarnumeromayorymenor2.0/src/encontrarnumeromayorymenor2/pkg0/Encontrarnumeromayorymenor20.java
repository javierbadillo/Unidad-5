/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encontrarnumeromayorymenor2.pkg0;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author javie
 */
public class Encontrarnumeromayorymenor20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Array ingresado: " + Arrays.toString(numeros));
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
    
}
