
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
public class Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum =0;
        for (int i = 0; i < 100; i++) {
            if(i%9 == 0){
                sum=sum+i;
            }
        }
        System.out.println("La suma de los multiplos de 9 es "+ sum);
        System.out.println("----------------------------------------");
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numeros para calcular ");
        System.out.println("Buscar multiplos de :");
        int num = leer.nextInt();
        System.out.println("hasta el numero :");
        int limite = leer.nextInt();
        
        sum=0;
        
        for (int i = 0; i <= limite; i++) {
            if(i%num == 0){
                sum=sum+i;
            }
        }
        System.out.println("La suma de los multiplos de "+num+" con for es "+ sum);
        
        int cont =0;
        int acum =0;
        while(cont<=limite){
            if(cont%num == 0){
                acum=acum+cont;
            }
            cont++; 
        }
        System.out.println("La suma de los multiplos de "+num+" con while es "+ acum);
    }
    
}
