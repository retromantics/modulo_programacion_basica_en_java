/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad2;

/**
 *
 * @author Cami
 */
public class Planta {
    private int nivelAgua;
    private int nivelLuz;
    private int maxAgua;
    private int minAgua;
    private int maxSol;
    private int minSol;
    private String nombre;
    private String tipo;
    private boolean florecido;

    public Planta() {
    }

    public Planta(int nivelAgua, int nivelLuz, int maxAgua, int minAgua, int maxSol, int minSol, String nombre, String tipo, boolean florecido) {
        this.nivelAgua = 50;
        this.nivelLuz = 50;
        this.maxAgua = 100;
        this.minAgua = 10;
        this.maxSol = 100;
        this.minSol = 10;
        this.nombre = nombre;
        this.tipo = tipo;
        this.florecido = florecido;
    }

    public int getMaxAgua() {
        return maxAgua;
    }

    public int getMinAgua() {
        return minAgua;
    }

    public int getMaxSol() {
        return maxSol;
    }

    public int getMinSol() {
        return minSol;
    }
    
    public int getNivelAgua() {
        return nivelAgua;
    }

    public int getNivelLuz() {
        return nivelLuz;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isFlorecido() {
        return florecido;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public void setNivelLuz(int nivelLuz) {
        this.nivelLuz = nivelLuz;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMaxAgua(int maxAgua) {
        this.maxAgua = maxAgua;
    }

    public void setMinAgua(int minAgua) {
        this.minAgua = minAgua;
    }

    public void setMaxSol(int maxSol) {
        this.maxSol = maxSol;
    }

    public void setMinSol(int minSol) {
        this.minSol = minSol;
    }

    public void setFlorecido(boolean florecido) {
        this.florecido = florecido;
    }
    
    
    //Metodos
    public void regar(int agua){
        //Nivel Min=10
        //Nivel Max= 100
        int nuevo= this.nivelAgua+agua;
        if(nuevo >= this.maxAgua-5){
            this.nivelAgua=nuevo;
            System.out.println("    Estoy a punto de ahogarme  !!!");
            
        }else{
            this.nivelAgua=nuevo;
            System.out.println("    Que refrescante , muchas gracias");
        }
    }
    
    public void darSolcito(int sol){
        //Nivel Min=10
        //Nivel Max= 100
        int nuevo= this.nivelLuz+sol;
        if(nuevo > this.maxSol){
            this.nivelLuz= nuevo;
            this.florecido=true;
            System.out.println("         _                  ");
            System.out.println("       _(_)_                ");
            System.out.println("      (_)@(_)               ");
            System.out.println("        (_)\\                ");
            System.out.println("           |                ");
            System.out.println("         \\|/               ");
            System.out.println("       \\\\|//              ");
            System.out.println("  ^^^^^^^^^^^^^^^^^^        ");
        }
    }
    
   
    
}
