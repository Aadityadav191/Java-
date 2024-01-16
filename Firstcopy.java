import javax.swing.*;

import java.awt.Container;
import java.awt.event.ActionListener;
public class Firstcopy extends JFrame
{
    JFrame F;
    JButton B;
    JTextField t1, t2;
    public Firstcopy()
      {
        F.setSize(500, 600);
        B=new JButton("CLICK ME ");
        B.setBounds(200,300,50, 90 );
        t1=new JTextField();
        t1.setBounds(100,50 ,300,80);
        t2= new JTextField();
        t2.setBounds(200,300,50, 90);
        ((Container) F).add(t1);
        ((Container) F).add(t2);
        F.add(B);
        F.setLayout(null);
        F.setVisible(true);
        t2.setEditable(false);
        B.addActionListener((ActionListener) this);
      }

    public static void main(String args[])
     {
      new Firstcopy();
     }

}
































