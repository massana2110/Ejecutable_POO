/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.FlowLayout;
import javax.swing.*;


/**
 * 
 * @author David Massana
 */
public class Ventana extends JFrame{

    private static final int ANCHO = 800;
    private static final int ALTO = 600;
    
    //Constructor que inicializa la ventana
    public Ventana(){
        setTitle("EJECUTABLE");
        setSize(ANCHO, ALTO);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

}
