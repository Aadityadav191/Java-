import java.awt.Container;

import javax.swing.JButton;

public interface JFrame {

    String EXIT_ON_CLOSE = null;

    void setSize(int i, int j);

    void setVisible(boolean b);

    void setLayout(Object object);

    void add(JButton b);

    void setTitle(String string);

    void setDefaultCloseOperation(String exitOnClose);

    Container getContentPane();

}
