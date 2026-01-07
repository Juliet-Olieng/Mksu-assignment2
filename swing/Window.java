// Create a Java Swing program that displays a window containing:
// i. A label,A text field, A button
// All components must be placed inside a panel, which is then added to a frame.
import javax.swing.*;

public class Window{
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Swing Structure ");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel
        JPanel panel = new JPanel();

        // Create label
        JLabel label = new JLabel("Name:");

        // Create text field
        JTextField textField = new JTextField(15);

        // Create button
        JButton button = new JButton("Submit");

        // Add components to panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Add panel to frame
        frame.add(panel);

        // Make frame visible
        frame.setVisible(true);
    }
}
