/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class MyFirstClass extends JFrame {
    public MyFirstClass(){
    setTitle("first gui");
    setSize(200, 250);
    setDefaultLookAndFeelDecorated(true);
    setResizable(true);
    setForeground(Color.BLUE);
    setVisible(true);
    }
}
