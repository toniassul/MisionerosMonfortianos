/*
Enunciado: Escribe un programa en Java que
sume una serie de números ingresados por el usuario
hasta que el usuario ingrese un número negativo
usando un bucle do-while.
 */
package estructurarepetitivas;

import java.util.Scanner;

/**
 *
 * @author Ascue
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int numero = 0;
        Scanner scan = new Scanner(System.in);
        int acumulador = 0;
        
        do {
            numero = scan.nextInt();
            acumulador = acumulador + numero;
            
        }while (numero >= 0);
        
        System.out.println("resultado de la suma de los numeros ingresados es: " + acumulador);
    }
    
}
