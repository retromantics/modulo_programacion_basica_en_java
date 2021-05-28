
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cami
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public boolean fechaCorrecta(){
    
        boolean esCorreta = false;
        try{
            LocalDate.of(this.anio, this.mes, this.dia);
            esCorreta=true;
        }catch(Exception e){
            esCorreta =false;
        }
        
        
        return esCorreta;
    }

    public void diaSiguiente(int cantDias) {
        LocalDate d = LocalDate.of(this.anio, this.mes, this.dia);
        
        for (int i = 1; i <= cantDias; i++) {
            d=d.plusDays(1);
            System.out.println(d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
    }
    
    
}
