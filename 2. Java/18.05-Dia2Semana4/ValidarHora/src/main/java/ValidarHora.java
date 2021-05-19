
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
public class ValidarHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese Hora:");
        int hora = leer.nextInt();
        System.out.println("Ingrese Minutos :");
        int min = leer.nextInt();
        System.out.println("Ingrese Segundos");
        int seg = leer.nextInt();
        if((hora >= 0 && hora <= 24) && (min >=0 && min < 60)&&(seg>=0 && seg < 60)){
            System.out.println("La hora "+hora+":"+min+":"+seg+" es valida");
        }else{
            System.out.println("la hora "+hora+":"+min+":"+seg+" es Invalida");
        }
    }
    
}
