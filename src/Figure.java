import javax.swing.*;
import java.awt.*;

public class Figure extends JComponent {
    private Color color;
//    private int type;
    public Figure(Color color) {
        this.color = color;
//        this.type = type;
        setOpaque(false);
    }
    public void paintComponent(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(20, 10, 40, 60);
        graphics.setColor((Color.yellow));
        graphics.drawString("dog", 30, 30);
    }

}
