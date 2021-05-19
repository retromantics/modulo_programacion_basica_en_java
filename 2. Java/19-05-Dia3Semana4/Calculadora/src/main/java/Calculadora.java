
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
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opt ;
        String continuar ="";
        
        double num1,num2,res,acum=0;
        int cant;
        
        do{
            
            System.out.println("======================");
            System.out.println("Calculadora ");
            System.out.println("Seleccione Operacion :");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Dividir");
            System.out.println("4.Multiplicar");
            opt = leer.nextInt();
        
            switch (opt) {
                case 1:System.out.println("Cuantos numeros desea sumar");
                       cant = leer.nextInt();
                       for (int i = 0; i < cant; i++) {
                           System.out.println("Ingrese numero :");
                           int suma = leer.nextInt();
                           acum +=suma;
                        }
                       System.out.println("La suma de los numeros ingresados es :" + acum);
                    break;

                case 2: System.out.println("Cuantos numeros desea restar");
                       cant = leer.nextInt();
                       for (int i = 0; i < cant; i++) {
                           System.out.println("Ingrese numero :");
                           int suma = leer.nextInt();
                           acum -=suma;
                        }
                       System.out.println("La resta de los numeros ingresados es :" + acum);
                    break;

                case 3: System.out.println("Ingrese el primer numero ");
                        num1 = leer.nextDouble();
                        System.out.println("Ingrese el segundo numero ");
                        num2= leer.nextDouble();
                        res =num1/num2;
                        System.out.println("El resultado es :" +res );
                    break;

                case 4: System.out.println("Ingrese el primer numero ");
                        num1 = leer.nextDouble();
                        System.out.println("Ingrese el segundo numero ");
                        num2= leer.nextDouble();
                        res =num1*num2;
                        System.out.println("El resultado es :" +res );
                    break;

            }
            
            System.out.println("Desea continuar ? (s/n)");
            continuar = leer.next();
        } while(continuar!= "n");
    }
    
}
