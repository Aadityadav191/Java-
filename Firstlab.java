import javax.swing.*;  
public class Firstlab  
{  

   Firstlab()
    {
      JFrame f=new JFrame();
      JButton b=new JButton("click ME ");
      b.setBounds(330,500,500, 5000);  
      JButton b1=new JButton("click ME ");
      b1.setBounds(130,100,100, 40);  
      f.add(b);
      f.add(b1);
      f.setSize(400,500);
      f.setLayout(null);
      f.setVisible(true);
    }

  public static void main(String args[])
    {
      new Firstlab();
    } 
}













