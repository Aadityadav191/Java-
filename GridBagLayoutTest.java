import javax.swing.*;
import java.awt.*;
public class GridBagLayoutTest extends JFrame {
   public GridBagLayoutTest() {
      setTitle("GridBagLayout Test");
      setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 5;
      gbc.gridy = 0;
      add(new JButton("Button1"), gbc);
      gbc.gridx = 0;
      gbc.gridy = 5;
      add(new JButton("Button2"), gbc);
      gbc.gridx = 2;
      gbc.gridy = 4;
      add(new JButton("Button3"), gbc);
   }
   public static void main(String[] args) {
      GridBagLayoutTest gbcTest = new GridBagLayoutTest();
      gbcTest.setSize(300,300);
      gbcTest.setVisible(true);
      gbcTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
 