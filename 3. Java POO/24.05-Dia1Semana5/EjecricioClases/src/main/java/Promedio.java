/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cami
 */
public class Promedio {
    float [] notas ;
    
    public float calcularPromedio(){
        
        float prom=0;
        float suma=0 ;
        
        for (int i = 0; i < this.notas.length; i++) {
            suma =suma+ this.notas[i];
        }
        prom = suma /this.notas.length;
        return prom;
    }
}
