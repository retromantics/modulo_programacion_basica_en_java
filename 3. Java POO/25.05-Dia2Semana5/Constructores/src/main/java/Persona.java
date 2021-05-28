/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cami
 */
public class Persona {
    String nombre="";
    int edad=0;
    
    public Persona(){
        nombre= "Camila";
        edad=34;
    }
    
    public Persona(String nombre, int edad){
        this.nombre= "Camila";
        this.edad=34;
    }
    
    public void presentarse(){
        System.out.println("Mi nombre es "+this.nombre+" y mi edad "+this.edad);
    }
}
