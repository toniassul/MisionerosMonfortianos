/*
Enunciado: Escribe un programa en Java que 
muestre la tabla de multiplicar de un número
ingresado por el usuario usando un bucle while.
 */
package estructurarepetitivas;
import java.util.Scanner;
/**
 *
 * @author Ascue
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int contador = 1;
        int resultado = 1;
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        System.out.println("TABLA DE MULTIPLICAR DEL " + numero);
        while (contador <= numero){
            resultado = numero * contador;
            System.out.println(contador + " * " + numero + " = " + resultado );
            contador++;
        }
    }
    
}
