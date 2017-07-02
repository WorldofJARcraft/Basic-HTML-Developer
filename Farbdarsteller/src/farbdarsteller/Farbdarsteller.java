/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farbdarsteller;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author user
 */
public class Farbdarsteller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Color your_color = Color.WHITE;
        your_color = JColorChooser.showDialog(null, "Wählen Sie eine Farbe aus!", null);
        String rgb = your_color.toString();
        rgb = rgb.substring(15, rgb.length() - 2);
        String hex = "#" + Integer.toHexString(your_color.getRGB()).substring(2);
        JTextArea Ausgabe = new JTextArea();
        Ausgabe.setText("hexadezimal: " + hex + "\nrgb: " + rgb);
        Object[] message = {Ausgabe};
        JOptionPane pane = new JOptionPane(message,
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.OK_OPTION);
        pane.createDialog(null, "Ihre Farbe").setVisible(true);
        System.exit(0);
    }

}
