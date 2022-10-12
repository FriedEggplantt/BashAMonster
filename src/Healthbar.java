import javax.swing.*;
import java.awt.*;

public class Healthbar extends JPanel {
    public Healthbar() {
    }

    /*
    This method paints the components on a canvas
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        addHealthbar(g);
    }

    /*
    this method paint ONE green rectangle
     */
    protected void addHealthbar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(10, 50, 300, 100);
    }
}
