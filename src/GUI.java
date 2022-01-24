import javax. swing.*;
import java.awt.*;

public final class GUI implements Runnable {
    public static void main(String[] args) {
        SwingUtilities.invokeLater (new GUI());
    }
    public void run() {
        // window
        JFrame f = new JFrame ("Hello, World!");
        f.setDefaultCloseOperation (JFrame. DISPOSE_ON_CLOSE );
        f.add(new JLabel("Hello World"));
        f.setLocation(500, 500);
//        f.setBounds(500, 500, 500, 500);
        //add button
        JButton button = new JButton();
        button.setText("woof");
        f.add(button);
        f.pack();
        f.setVisible(true);
    }
}
