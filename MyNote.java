/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynote;

import javax.swing.JFrame;

/**
 *
 * @author sharif
 */
public class MyNote {
    
    public static void main (String[] args){
      MyNoteFrame frame = new MyNoteFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);//to make the frame in screen center
      frame.setVisible(true); // to make the frame visible
      
      
    }
}
