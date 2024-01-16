

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
class Myapp extends JFrame implements WindowListener 
 {
    
    public Myapp()
      {
       JFrame F=new JFrame();
       F.setSize(300,200);
       F.setVisible(true);
       F.addWindowListener (this);
      }
 
 
    public void windowlistener(Window Event e)
      {
      system.exist(0);
      F.setvisible(false);
      }
  
     public static void main(String[] args)
      {
       new Example();
      }

}









