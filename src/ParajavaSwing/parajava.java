/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParajavaSwing;

import javax.swing.JFrame;
//paso 8 importar la clase con la ventana
import javaswing.Javaswing;//import paquete.clase

/**
 *
 * @author LP 13
 */
public class parajava {
     public static void main(String[] args) 
    {
       
   Javaswing ventana = new Javaswing(); // creo un  objeto  tipo javaswing
 ventana.setVisible(true);
 ventana.setBounds(0, 0, 300, 300);
   ventana.setTitle("Mi Primer Interfaz Grafica");//  siguiente  ints. le  pone  titulo a la  ventana
  ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//la  siguiente  sentencia  es para  finalizar el  proyecto  al  cerrar
    
    }  
}



   