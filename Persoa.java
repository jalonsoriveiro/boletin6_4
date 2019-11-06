/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

/**
 *
 * @author jalonsoriveiro
 */
public class Persoa {
    
   private String nome;
    private int peso;
    
    public Persoa(String nombre,int peso){   
     
     this.nome = nombre;
     this.peso = peso;
   } 
    
    
    //public void mostrarDatos(String nomePer1,int pesoPer1,String nomePer2,int pesoPer2){
    public void mostrarDatos(Persoa persoa2){
        
    if(peso > persoa2.peso){
       System.out.println("Persoa con nome "+nome+" Pesa "+peso+" y la diferencia "+(peso-persoa2.peso));
    }
    else if (persoa2.peso > peso){
       System.out.println("Persoa con nome "+persoa2.nome+" Pesa "+persoa2.peso+" y la diferencia "+(persoa2.peso-peso));
    }
    else
       System.out.println("Tienen el mismo peso");
}
}