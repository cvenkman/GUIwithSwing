import javax. swing.*;
import java.awt.*;
import java.awt.event.*;

public final class GUI implements Runnable {
    public static void main(String[] args) {
        SwingUtilities.invokeLater (new GUI());
    }
    public void run() {
        // window
        JFrame f = new JFrame("Hello, World!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel("Hello World"));
        f.setLocation(500, 500);
        //add button
        JButton button = new JButton(new ButtonEventListener());
        button.addActionListener();
        button.setText("woof");
        f.add(button);
        f.pack();
        f.setVisible(true);
    }
    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "meow";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}