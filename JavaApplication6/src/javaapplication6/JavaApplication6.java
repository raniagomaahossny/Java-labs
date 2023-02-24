/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.Spring.width;

/**
 *
 * @author user
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myframe = new JFrame();
        String title = null;
        public void PaintComponent(Graphics g){
            super.PaintComponent(g);
            g.drawString("Hallo Ich Haise Rania");
        }

        myframe.setTitle("rania note");
        myframe.setContentPane(new JPanel());
    }
}

class Panel extends JPanel implements Runnable {
    
    public void panel (){    
        Dimension width = null;
    }
        
        @Override
    
        public void run(){}
            
    myframe.setSize(400,500);
    boolean b = false;

    myframe.setVisible(true);
        
}
