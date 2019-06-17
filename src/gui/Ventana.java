/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Container;
import javax.swing.*;

/**
 * 
 * @author David Massana
 */
public class Ventana extends JFrame{

    private static final int ANCHO = 800;
    private static final int ALTO = 600;
    private JLabel etiqueta;
    
    //Constructor que inicializa la ventana
    public Ventana(){
        super("Ejecutable");
        initComponents();
    }

    public void initComponents(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        etiqueta = new JLabel();
        Container con = getContentPane();
        etiqueta.setIcon(new ImageIcon(getClass().getResource("imagePOO.jpg")));
        etiqueta.setBounds(150, 100, 500, 300);
        con.add(etiqueta);
        setSize(ANCHO, ALTO);
    }
}
