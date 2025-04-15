//mouse pointer
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MousePositionTracker extends JFrame {

    JLabel positionLabel;

    public MousePositionTracker() {
        setTitle("Mouse Position Tracker");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        positionLabel = new JLabel("Move the mouse inside the window", SwingConstants.CENTER);
        positionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(positionLabel, BorderLayout.SOUTH);

        // Mouse motion listener to track cursor movement
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                positionLabel.setText("Mouse Position: X = " + x + ", Y = " + y);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MousePositionTracker();
    }
}
