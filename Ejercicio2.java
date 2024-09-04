/*
Enunciado: Escribe un programa en Java que calcule la 
suma de todos los números pares hasta un
número límite dado por el usuario usando un bucle for.
 */
package estructurarepetitivas;
import java.util.Scanner;
/**
 *
 * @author Ascue
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        for(int i = 1; i <= numero; i++){
            if(i % 2 == 0){
                System.out.println("numero par:" + i );   
            }
            
        }
    }
    
}
