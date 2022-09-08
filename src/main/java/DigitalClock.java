import javax.swing.*;
import java.awt.*;

public class DigitalClock extends JFrame {

    JLabel jLabelClock;
    ClockThread clockThread;

    public DigitalClock() {

        jLabelClock = new JLabel();
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jLabelClock.setFont(new Font("Arial", Font.ITALIC,80));
        add(jLabelClock);
        setTitle("Digital Clock");
        setSize(1300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
        clockThread = new ClockThread(this);

    }
}
