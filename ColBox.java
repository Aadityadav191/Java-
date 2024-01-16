import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ColBox extends JFrame implements ActionListener
{
    JButton red, pink, black;
    public ColBox()
      {
        setSize(500, 300);
        red=new JButton("RED");
        pink=new JButton("PINK");
        black=new JButton("BLACK");
        add(red);
        add(pink);  
        add(black);
        setLayout (new FlowLayout()) ;
        red.addActionListener(this);
        pink.addActionListener(this);
        black.addActionListener(this);
        red.setActionCommand("one");
        pink.setActionCommand("two");
        black.setActionCommand("three");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
      }

    private void setVisible(boolean b) {
    }

    private void setDefaultCloseOperation(String exitOnClose) {
    }

    private void setLayout(FlowLayout flowLayout) {
    }

    private void add(JButton red2) {
    }

    private void setSize(int i, int j) {
    }

    public void actionperformed(ActionEvent e)
      {
       if (e.getActionCommand().equals("one"))
         {
         setBackground(Color.RED);
         }
       else if (e.getActionCommand().equals("two"))
        {
         setBackground(Color.PINK);
        }
       else
        {
         setBackground(Color.black);
        }
      }
    private void setBackground(Color red2) {
    }

    public static void main(String args [])
     {
       new ColBox();
     }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
      throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}

