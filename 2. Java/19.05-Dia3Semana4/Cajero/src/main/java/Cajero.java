
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
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner( System.in);
        int opt,saldo=0,monto =0 ;
        String cont ="";
        do{
            System.out.println("\n============================================================");
            System.out.println("    Bienvenido , por favor seleccione una opcion:   ");
            System.out.println("    1.Consultar Saldo");
            System.out.println("    2.Realizar Abono /Deposito");
            System.out.println("    3.Realizar Giro");
            
            opt= leer.nextInt();
            
            switch (opt) {
                case 1: System.out.println(" Su saldo actual es :"+ saldo);
                    break;   
                case 2: System.out.println("    Ingrese el monto que desea abonar :");
                        monto = leer.nextInt();
                        saldo += monto;
                        System.out.println(" Su saldo actual es :"+ saldo);
                    break;   
                case 3: System.out.println("    ¿ Cuanto dinero desea retirar ?");
                        monto = leer.nextInt();
                        if(saldo >= monto){
                            saldo -= monto;
                            System.out.println(" Dinero Entregado :" +monto);
                        }else{
                            System.out.println(" El monto ingresado es mayor al saldo disponible .");
                        }
                        System.out.println(" Su saldo actual es :"+ saldo);
                default:     
                    System.out.println(" Ingrese una opcion valida");
            }
            
            System.out.println("¿ Desea continuar con otra operacion ? (s/n)");
            cont = leer.next();
            
        }while (!cont.equals("n"));
    }
    
}
