/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
//PASO1 IMPORTAR  las librerias
//import Gui.*;
import javax.swing.*;//importamos todo el swing
import java.awt.*;//libreria grafica del sistema OPERATIVO
/**
/**
 *
 * @author LP 13
 */
public class Javaswing extends JFrame //paso2 heredar mi  clase desde jframe

{

  //paso 3 declara  los  elementos   a  utulizar
    JPanel panel;//creacion  de objeto  panel
    JLabel label;
    JTextField text;
    JButton boton;
    JCheckBox cbox;
    JRadioButton rb;
    //paso4 definicion del constructor de la clase
    public Javaswing() //tiene  el  mismo  nombre  de la clase
    {
        //paso 5 crear e  inicializar los  objetos 
    panel = new JPanel();//creo un objeto tipo panel
    label = new JLabel();
    text = new JTextField(15);//15 caracteres
    boton = new JButton();
    
    // paso 6 agregar los elementos  al jframe
    this.add(panel);//recomensdable agregar el panel al  frame
    panel.add(label);//agregar un objeto label al panel
    panel.add(text);
    panel.add(boton);
    panel.add(rb);
    panel.add(cbox);
    //paso7 propiedades de los  elementos
    label.setText("nombre");
    boton.setText("enviar");
    panel.setBackground(Color.pink);//color  de fondo del panel
    }
}
   
    
 




