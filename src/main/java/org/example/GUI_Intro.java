package org.example;

import javax.swing.JOptionPane;

public class GUI_Intro {
    public static void main(String [] args){

        String bike = JOptionPane.showInputDialog("What bike do you ride?");
        JOptionPane.showMessageDialog(null,"I ride a " +bike+ " bike");

        int ratio = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your gear ratio?"));
        JOptionPane.showMessageDialog(null,ratio + "    its a good one");


    }
}
