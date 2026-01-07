import javax.swing.*;
import java.awt.*;

public class Swing {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Java Swing Exercise");
        frame.setSize(520, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // ===== MENU BAR =====
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // ===== NAME =====
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 30, 80, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(90, 30, 120, 25);
        frame.add(nameField);

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(220, 30, 80, 25);
        frame.add(submitBtn);

        // ===== USERNAME =====
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 70, 80, 25);
        frame.add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(90, 70, 120, 25);
        frame.add(userField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(220, 70, 80, 25);
        frame.add(loginBtn);

        // ===== CHECKBOX, RADIO, COMBO =====
        JCheckBox termsCheck = new JCheckBox("Accept Terms");
        termsCheck.setBounds(20, 110, 120, 25);
        frame.add(termsCheck);

        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(150, 110, 60, 25);
        frame.add(maleRadio);

        JComboBox<String> comboBox =
                new JComboBox<>(new String[]{"Java", "Python", "C++"});
        comboBox.setBounds(230, 110, 80, 25);
        frame.add(comboBox);

        // ===== CLICK ME BUTTON (TOP) =====
        JButton clickBtn = new JButton("Click Me");
        clickBtn.setBounds(20, 150, 100, 30);
        frame.add(clickBtn);

        clickBtn.addActionListener(e ->
                JOptionPane.showMessageDialog(frame, "Button Clicked!")
        );

        // ===== CALCULATOR =====
        JPanel calcPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        calcPanel.setBounds(150, 150, 180, 180);

        String[] keys = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "+", "=", "C"
        };

        for (String key : keys) {
            calcPanel.add(new JButton(key));
        }
        frame.add(calcPanel);

        // ===== CLICK ME BUTTON (BOTTOM) =====
        JButton clickBtn2 = new JButton("Click Me");
        clickBtn2.setBounds(20, 300, 100, 30); // ✅ moved down
        frame.add(clickBtn2);

        clickBtn2.addActionListener(e ->
                JOptionPane.showMessageDialog(frame, "Button Clicked!")
        );

        frame.setVisible(true);
    }
}
