/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Vitaliy
 */
public class Frame extends javax.swing.JFrame{
    Frame(int array[][]){
        setBounds(50, 50, 300, 300);
        setVisible(true);
        int height = array.length;
        int width = array[0].length;
    }
    
    void fetch_array(int weight, int height) {
        
    }
}
