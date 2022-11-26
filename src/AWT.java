import java.awt.*;
public class AWT extends Frame {
    AWT(){
        Button b = new Button("Click Me!!");
        setBounds(30, 100, 80, 30);
        add(b);
        setSize(300, 300);
        setTitle("This is our basic AWT example");
        setVisible(true);
        setLayout(null);
    }
    public static void main(String args[]) {
        AWT f = new AWT();
    }
}


