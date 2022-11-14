package it.unibo.mvc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.PanelUI;

import java.awt.BorderLayout;


/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUIWithFileChooser {

    private final JFrame frame = new JFrame();
    final JPanel panel = new JPanel(); 
    panel.setLayout(new BorderLayout());  
    final JButton browse = new JButton("Browse...");
    final JTextField tx = new JTextField();
        

}
