import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private static JPanel panel;
    private static JTextField userText;
    private static JTextField passwordText;
    private static JLabel messageAfterLogin;

   private void createUserIcons() {
       JLabel userLabel = new JLabel("User");
       userLabel.setBounds(20, 20, 80, 35);
       panel.add(userLabel);

       userText = new JTextField(20);
       userText.setBounds(120, 20, 165, 35);
       panel.add(userText);
   }

    private void createPasswordIcons() {
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20, 70, 80, 35);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(120, 70, 165, 35);
        panel.add(passwordText);
    }

    private void createButton() {
        JButton button = new JButton();
        button.setText("Login");
        button.setBounds(55, 130, 80, 35);
        button.addActionListener(new ButtonEventListener());
        panel.add(button);
    }

    public GUI() {
        JFrame frame = new JFrame("swing test");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        createUserIcons();
        createPasswordIcons();
        createButton();

        messageAfterLogin = new JLabel("");
        messageAfterLogin.setBounds(20, 180, 300, 35);
        panel.add(messageAfterLogin);

        frame.setVisible(true);
    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (userText.getText().equals("admin") && passwordText.getText().equals("admin")) {
                messageAfterLogin.setText("Success!");
                JOptionPane.showMessageDialog(null,  "meow", "Output", JOptionPane.PLAIN_MESSAGE);
            }
            else
                messageAfterLogin.setText("Wrong password or login, try again");
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
