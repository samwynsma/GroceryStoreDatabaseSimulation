import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainMenu extends JComponent implements ActionListener {

    JFrame mainFrame;

    public MainMenu() {
        mainFrame = new JFrame("Main Menu");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 600);
        mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JButton popupButton = new JButton("Popup");
        JTextField textField = new JTextField(20);
        popupButton.addActionListener(e -> AddOptions(textField.getText()));
        mainFrame.add(popupButton, BorderLayout.CENTER);
        mainFrame.add(textField);

        mainFrame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new MainMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private int AddOptions(String userInput) {
        Object[] options = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5"};
        return JOptionPane.showOptionDialog(
            mainFrame,
            userInput, 
            "Popup Title", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.INFORMATION_MESSAGE,
            null,
            options,
            options[0]
        );
    }
}