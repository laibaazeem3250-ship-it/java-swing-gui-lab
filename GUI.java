package mygui;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
 

 public GUI() {
     super("I've been framed!");
     setBounds(0, 0, 300, 300);
 }

 public static void main(String[] args) {
     JFrame frame = new GUI();
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
