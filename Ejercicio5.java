/*
 Enunciado: Escribe un programa en Java que 
cuente cuántos dígitos tiene un número ingresado
por el usuario usando un bucle do-while.
 */
package estructurarepetitivas;

import java.util.Scanner;

/**
 *
 * @author Ascue
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int contador = 0;
        long dato = 0;
        long divisor;
        Scanner scan = new Scanner(System.in);
        long numero = scan.nextLong();
        dato = numero;
        numero = Math.abs(numero);
        do{
            contador++;
           numero = numero / 10;
        }while(numero > 0);
        System.out.println("el numero "+ dato + " tiene " + contador  + " numeros de largo");
    }
    
}
