import javax.swing.*;  
public class FirstSwingExample {  
public static void main(String[] args) 
{  
JFrame f=new JFrame;  
          
JButton b=new JButton("click");  
JButton c=new JButton("click");  
JButton d=new JButton("click");  
b.setBounds(130,100,100, 40); 
c.setBounds(100,100,200, 50);  
d.setBounds(130,100,100, 40); 
      c.setBounds(100,180,200, 50);  
      d.setBounds(100,260,200, 50);  
      f.add(b);
      f.add(c);
      f.add(d); 
          
f.add(b);
          
f.setSize(400,500);  
f.setLayout(null);  
f.setVisible(true);   
}  
}  