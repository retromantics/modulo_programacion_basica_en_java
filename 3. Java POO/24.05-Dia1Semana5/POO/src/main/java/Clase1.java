/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cami
 */
public class Clase1 {
    //Atributos
    String nombre;
    int edad;
    
    public void mostrarDatos(){
        System.out.println("    El nombre es "+nombre +" y la edad "+edad);
    }
    
    public int sumar(int num1,int num2){
        int res =0;
        res = num1+num2;
        return res;
    }
    
    
    public Clase1() {
    }
    
}
