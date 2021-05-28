
import Actividad2.Planta;
import java.util.ArrayList;
import java.util.List;
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
public class Cons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opt=0;
        Scanner leerOpt = new Scanner(System.in);
        
        ArrayList<Planta> Plantario = new ArrayList<Planta>();
        
        Planta p = new Planta();
        p.setNombre("Ficus");
        Plantario.add(p);
        
        Planta p2 = new Planta();
        p2.setNombre("Cucharita");
        Plantario.add(p2);
        
        do{
            mostrarMenu();
            opt = leerOpt.nextInt();
            switch(opt){
                case 1 : 
                    break;
                case 2 : for (int i = 0; i < Plantario.size(); i++) {
                        System.out.println("1." + Plantario.get(i).getNombre());
                        }
                        
                    break;
                        
            }
            
        }while(opt != 4);
        
    }
    
    
    public static void mostrarMenu(){
        System.out.println("    \n- Bienvenido a tu plantario -");
        System.out.println("        Selecciona una opcion :");
        System.out.println("    1. Plantar");
        System.out.println("    2. Seleccionar Planta");
        System.out.println("    3. Ver Estado Plantas "); 
        System.out.println("    4. Salir");
    }
}
    


