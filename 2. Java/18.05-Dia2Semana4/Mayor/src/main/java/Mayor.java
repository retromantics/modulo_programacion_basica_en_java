
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
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int numeroMayor=0;
        int cant;
        int actual ;
        
        System.out.println("Cuantos numeros desea comparar? ");
        cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese numero :");
            actual = leer.nextInt();
            if(actual >numeroMayor){
                numeroMayor = actual;
            }
        }
        System.out.println("El numero mayor ingresado es :" + numeroMayor);
    }
    
}
