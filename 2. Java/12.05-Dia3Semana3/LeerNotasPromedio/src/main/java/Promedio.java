
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
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n1,n2,n3,n4,prom;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nota");
        n1 = leer.nextFloat();
        System.out.println("Ingrese nota");
        n2 = leer.nextFloat();
        System.out.println("Ingrese nota");
        n3 = leer.nextFloat();
        System.out.println("Ingrese nota");
        n4 = leer.nextFloat();
        
        prom = (n1+n2+n3+n4)/4;
        
        System.out.println("El promedio es :" + prom);
        
        
    }
    
}
