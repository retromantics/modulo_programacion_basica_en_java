
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
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        while(true){
            System.out.println("Selecciones una opcion :");
            System.out.println("1. Sumar 2 Numeros");
            System.out.println("2. Restar 2 numeros");
            System.out.println("3. Mostrar los pares hasta un numero ingresado");
            
            int opcion = leer.nextInt();
            int num1,num2;
            switch (opcion) {
                case 1: System.out.println("Ingrese un numero");
                        num1=leer.nextInt();
                        System.out.println("Ingrese otro numero");
                        num2 = leer.nextInt();
                        System.out.println("La suma de los numeros ingresadoes es :"+(num1+num2));
                    break;
                case 2: System.out.println("Ingrese un numero");
                        num1=leer.nextInt();
                        System.out.println("Ingrese otro numero");
                        num2 = leer.nextInt();
                        System.out.println("La division de los numeros ingresadoes es :"+(num1/num2));
                        break;
                case 3: System.out.println("Ingrese un numoer");
                        num1 = leer.nextInt();
                        for (int i = 0; i < 10; i++) {
                        
                    }
                
                default :
                    throw new AssertionError();
            }
            
            
        }
       
        
        
        
    }
    
}
