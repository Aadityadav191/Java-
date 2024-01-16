import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
public class Simple extends JFrame implements ActionListener
{  
   JFrame f;  
   JButton plus , minus;

    public Simple()
     {  
      f=new JFrame();
      JTextArea b=new JTextArea("First Numhber");
      JTextArea c=new JTextArea(" Second Number ");
      JButton d=new JButton(" ADDITION  ");
      
      b.setBounds(100,100,200, 50);  
      c.setBounds(100,180,200, 50);  
      d.setBounds(100,260,200, 50);  
      f.add(b);
      f.add(c);
      f.add(d);
      f.setSize(400,500);
      f.setLayout(null);
      f.setVisible(true); 
    
     }  
      public static void main(String[] args)
        {  
          new Simple();  
        }
      @Override
      public void actionPerformed(ActionEvent e)
      {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
      }  
}  


