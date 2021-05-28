/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cami
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clase1 c1 = new Clase1();
        c1.nombre = "Camila";
        c1.edad = 34;
        c1.sumar (5,6);
        c1.mostrarDatos();
        
        Clase1 c2 = new Clase1();
        c2.nombre="Emilio";
        c2.mostrarDatos();
        
    }
    
}
