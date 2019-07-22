import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class helloWorld {
    private JPanel rootPanel;
    private JLabel helloLabel;
    private JButton helloButton;
    private JTextField nameTextField;

    public helloWorld() {
        helloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String greeting = "Hello " + nameTextField.getText ();
                helloLabel.setText (greeting);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame ("helloWorld");
        frame.setContentPane(new helloWorld().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
