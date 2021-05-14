
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
public class Viaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cantAl = 0;
        int costoPorAl= 0;
        int rango ;
        int total ;
        System.out.println("Inregse la cantudad de alumnos :");
        cantAl= leer.nextInt();
        System.out.println("Seleccione el rango de alumnos :");
        System.out.println("1 . 100 o mas");
        System.out.println("2 . 50 a 99");
        System.out.println("3 . 30 a 40");
        System.out.println("4 . 30 o menos");
        rango = leer.nextInt();
        
        switch (rango) {
            case 1 :    costoPorAl = 6500;
                        total = costoPorAl * cantAl;
                        break;
            case 2 :    costoPorAl = 7000;
                        total = costoPorAl * cantAl;
                        break;
            case 3 :    costoPorAl = 9500;
                        total = costoPorAl * cantAl;
                        break;
            default: 
                        total = 40000;
        }

        
        
        
    }
    
}
