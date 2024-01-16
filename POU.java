import javax.swing.*;
import java.awt.*;
public class POU extends JFrame 
{
    JButton b1,b2,b3,b4,b5;
    public POU()
    {
        setVisible(true);
        b1 = new JButton("Computer");
        b2 = new JButton("Software");
        b3 = new JButton("Electronics");
        b4 = new JButton("Pokhara University");
        b5 = new JButton("PoU");

        setLayout(new GridBagLayout());
        GridBagConstraints xyz = new GridBagConstraints();
        xyz.fill=GridBagConstraints.HORIZONTAL;
        xyz.weightx = 5;
        xyz.gridx = 0;
        xyz.gridy = 0;
        add(b1,xyz);
        xyz.gridx = 1;
        xyz.gridy = 0;
        add(b2,xyz);
        xyz.gridx = 2;
        xyz.gridy = 0;
        add(b3,xyz);

        xyz.gridwidth =3;
        xyz.ipady = 40;
        xyz.gridx = 0;
        xyz.gridy = 1;
        add(b4,xyz);

        xyz.gridwidth = 2;
        xyz.insets = new Insets(30,0,0,0);
        xyz.ipady = 0;
        xyz.weighty = 1;
        xyz.anchor = GridBagConstraints.PAGE_END;
        xyz.gridx = 1;
        xyz.gridy = 2;
        add(b5,xyz);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

     private void setDefaultCloseOperation(String exitOnClose) {
    }

    private void pack() {
    }

    private void add(JButton b12, GridBagConstraints xyz) {
    }

    private void setLayout(GridBagLayout gridBagLayout) {
    }

    private void setVisible(boolean b) {
    }

    public static void main(String[] args)        
       {
        new POU();
       }
}







