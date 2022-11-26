//import java.awt.*;
import javax.swing.*;
public class swing{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton b = new JButton();
        b.setText("Click");
        frame.add(b);
        frame.setSize(500, 600);
        b.setLayout(null);
        frame.setVisible(true);
    }
}

