/*
Enunciado: Escribe un programa en Java 
que calcule el factorial de un número dado por el usuario
usando un bucle while.
 */
package estructurarepetitivas;
import java.util.Scanner;
/**
 *
 * @author Ascue
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        int contador = 1;
        int factorial = 1;
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
       
        while(contador <= numero){
            factorial = factorial * contador;
            contador++;
            
        }
        System.out.println("resultado del factorial " + numero + " es: " + factorial);
        
    }
    
}
