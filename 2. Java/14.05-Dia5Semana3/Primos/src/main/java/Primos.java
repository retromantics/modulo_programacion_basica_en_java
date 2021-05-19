
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
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int limite =0;
        int sumaPrimos=0;
        
        System.out.println("Ingrese numero limite :");
        limite=leer.nextInt();
        
        for (int i = 1; i <= limite; i++) {
            //busco primos
            int cantMultiplos =0;
            String divisores ="";
            
            //reviso si el numero i tiene divisores entes de el
            for(int j=1;j<=i;j++){ 
                if(i%j==0){
                 cantMultiplos++;
                 sumaPrimos = sumaPrimos + i;
                 divisores =divisores.concat(String.valueOf(j)+" ");
               }
            }
            
            //Si tiene menos de 3 divisores es primo
            if(cantMultiplos <3){
                System.out.println(i +" - Primo ");
            }else{
                System.out.println(i+" - No Primo ("+divisores+")");
            }
        }
        System.out.println("La suma de numeros primos es :" + sumaPrimos);
        
    }
    
}
