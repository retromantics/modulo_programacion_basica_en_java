
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
public class Actividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int opt;
        String cont="";
        do{
            System.out.println("Selecciones opcion");
            System.out.println("1. Palidromo");
            System.out.println("2. ");
            System.out.println("3. ");

            opt =leer.nextInt();

            switch (opt) {
                case 1: System.out.println("Ingrese palabra");
                        String palabra = leer.next();
                        String vuelta= "";
                        palabra = palabra.toLowerCase();
                        
                        for (int i = palabra.length()-1; i >=0; i--) {
                            vuelta+=palabra.charAt(i);
                        }
                        if(palabra == vuelta){
                            System.out.println("Son Palidromos");
                        }else{
                            System.out.println("No son palidromos");
                        }
                        
                    break;
                case 2:

                    break;
                default :
                    System.out.println("\nDesea continuar (s/n)");
                    break;
                
            }
        }while(cont!="n");
    }
    
}
