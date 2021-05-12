
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
public class SiHacer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        float num ;
        System.out.println("Ingrese un numero");
        num = leer.nextFloat();
        
        if(num >0){
            System.out.println("El numero ingresado es positivo");
        }else{
            System.out.println("El numero ingresado es negativo");
        }
    }
    
}
