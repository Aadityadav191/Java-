import java.awt.*;
import java.awt.event.*;
public class LearnAWT extends Frame { 
            TextField tf1; 
            TextField tf2; 
            Label l1; 
            Button b;
                    LearnAWT() { 
                          setTitle("Adder"); 
                          tf1 = new TextField(); 
                          tf1.setBounds(100, 50, 100, 500);
                          tf2 = new TextField(); 
                          tf2.setBounds(100, 100, 100, 500); 
                          b = new Button("Add"); 
                          b.setBounds(110,220,100,50);
                          l1 = new Label(""); 
                          l1.setBounds(100, 120, 100, 50); 
                          add(b); 
                          add(tf1); 
                          add(tf2); 
                          add(l1); 
                          setSize(300,300); 
                          setVisible(true); 

               b.addActionListener(new ActionListener()
                {
               public void actionPerformed(ActionEvent e) 
               { 
                    int a = Integer.parseInt(tf1.getText());
                    int b = Integer.parseInt(tf2.getText()); 
                    int c = a + b; 
                    l1.setText("Their sum is = " + String.valueOf(c)); 
               }
                }); 
            } 
public static void main(String []args)
          { 
           new LearnAWT();
          } 
}












