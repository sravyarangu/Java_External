//key up key down
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventSwing extends JFrame implements KeyListener {
    JTextField textField;
    JLabel statusLabel;

    public KeyEventSwing() {
        setTitle("Key Event Example");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(20);
        statusLabel = new JLabel("Type in the text field...");

        add(textField);
        add(statusLabel);

        textField.addKeyListener(this);

        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        statusLabel.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        statusLabel.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        // Optional: show typed char
    }

    public static void main(String[] args) {
        new KeyEventSwing();
    }
}
