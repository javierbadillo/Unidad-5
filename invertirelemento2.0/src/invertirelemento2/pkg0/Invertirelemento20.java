/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertirelemento2.pkg0;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author javie
 */
public class Invertirelemento20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        int[] invertido = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array invertido: " + Arrays.toString(invertido));
    }
    
}
