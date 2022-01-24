import javax. swing.*;
import java.awt.*;
import java.awt.event.*;

public final class GUI extends JFrame {
    private static JButton button = new JButton();

    private GUI() {
        super("doggo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel banner = new JLabel("Hello World");
//        add(new JLabel("Hello World"));
        banner.setForeground(Color.yellow);
        add(new JColorChooser(banner.getForeground()));
        setLocation(500, 500);

        JLayeredPane pane = getLayeredPane();
//        Figure figure = new Figure((Color.green));
        button.addActionListener(new ButtonEventListener());
        button.setText("woof");
        button.setBounds(60, 60, 60, 20);

//        figure.setBounds(20, 10, 40, 60);
//        pane.add(figure, JLayeredPane.PALETTE_LAYER);
        pane.add(button, JLayeredPane.POPUP_LAYER);

        setSize(300, 300);
        setVisible(true);
    }


    public static void main(String[] args) {
//        run();
        new GUI();
    }
    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "meow";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}