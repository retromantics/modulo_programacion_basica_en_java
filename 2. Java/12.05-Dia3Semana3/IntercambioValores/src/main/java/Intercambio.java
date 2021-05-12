
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cami
 */
public class Intercambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int A, B, C;
        System.out.print("Introduzca valor de A: ");
        A = leer.nextInt();
        System.out.print("Introduzca Valor de B: ");
        B = leer.nextInt();
        System.out.println("Valores iniciales: A = " + A + " B = " + B);
        C = A;
        A = B;
        B = C;
        System.out.println("Valores intercambiados: A = " + A + " B = " + B);
    }
    
}
