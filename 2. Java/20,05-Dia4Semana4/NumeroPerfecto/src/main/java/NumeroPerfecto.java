
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
public class NumeroPerfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        String con="";
        while(!con.equals("n")){
            long acum=0;
            long num;
            System.out.println("____________________________________________________________");
            System.out.println("Ingrese un numero para saber si es perfecto :");
            num = Long.parseLong(leer.next());

            for (long i = 1; i <= num/2; i++) {
                if(num % i == 0){
                    acum +=i;
                    System.out.println(i);
                }
            }

            if (acum== num){
                System.out.println("El numero ingresado es perfecto");
            }else{
                System.out.println("El numero ingresado no es perfecto");
            }
            
            System.out.println("Desea probar otro numero (s/n)?");
            con = leer.next();
        }
    }
    
}
