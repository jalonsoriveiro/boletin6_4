/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*4-Coñecidos o nome e o peso de dúas persoas,
        queremos escribir os datos da que pesa máis e, a diferenza de peso entre elas .*/
        
        Scanner sc = new Scanner(System.in);  
        System.out.println("Dime tu nombre");
        String nombrePer1 = sc.nextLine();
        System.out.println("Cuanto pesas:");
        int pesoPer1 = sc.nextInt();
        Persoa persoa1 = new Persoa(nombrePer1,pesoPer1);
        //
        System.out.println("Dime tu nombre");
        String nombrePer2 = sc.next();
        System.out.println("Cuanto pesas:");
        int pesoPer2 = sc.nextInt();
        Persoa persoa2 = new Persoa(nombrePer2,pesoPer2);
        
        persoa1.mostrarDatos(persoa2);
        
    }
    
}
