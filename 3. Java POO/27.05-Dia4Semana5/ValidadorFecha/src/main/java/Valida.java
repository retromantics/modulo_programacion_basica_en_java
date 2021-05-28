
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
public class Valida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Fecha fec= new Fecha();
        String opt = "s";
        try{
        while(opt.equals("s")){
            System.out.println("Ingrese el dia");
        fec.setDia(leer.nextInt());
        System.out.println("Ingrese el mes");
        fec.setMes(leer.nextInt());
         System.out.println("Ingrese el año");
         fec.setAnio(leer.nextInt());
         
         if(fec.fechaCorrecta()){
             System.out.println("La fecha ingresada es valida");
             System.out.println("Cuatos dias consecutivos desea ver?");
             int cantDias = leer.nextInt();
             fec.diaSiguiente(cantDias);
         }else{
             System.out.println("La fecha ingresada no es valida");
         }
         
            System.out.println("Desea inrgesar una nueva fecha?(s/n)");
            opt = leer.next();
        }
        }catch(Exception e){}
       
    }
    
}
