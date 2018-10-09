/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30rentcar;

import javax.swing.JOptionPane;

/**
 *
 * @author G6
 */
public class JavaApplication30RentCar {

    /**
     * @param args the command line arguments
     */
    //@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        float k, r=30, exc=0, exc2=0, km=300;
        String kilometros; 
         kilometros = JOptionPane.showInputDialog("Ingrese la cantidad de kilometros recorridos en el vehiculo:");
         k = Float.parseFloat(kilometros);
         
         if (k>0 & k<=300)
         {
           System.out.println("El monto total de la renta del vehiculo es:$"+r);
         }
         
         if (k>300 & k<=1000)
         {
             exc=(float) ((float) (k-km)*0.15);
             System.out.println("El monto total de la renta del vehiculo es:$"+r+exc);
         }
         if (k>1000)
         {
             exc2=(float) ((float) (k-km)*0.10);
             System.out.println("El monto total de la renta del vehiculo es$:"+r+exc2);   
         }

         }
    }