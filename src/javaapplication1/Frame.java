package javaapplication1;

/**
 *
 * @author Vitaliy
 */
public class Frame extends javax.swing.JFrame{
    Frame(int array[][]){
        grand_frame();
     
        int height = array.length;
        int width = array[0].length;
    }
    
    void fetch_array(int weight, int height) {
        
    }
    
    void grand_frame() {
        setBounds(50, 50, 300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
