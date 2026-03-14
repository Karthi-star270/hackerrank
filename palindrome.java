mport javax.swing.*;

public class PalindromeChecker extends JFrame {
    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;

    public PalindromeChecker() {
        
        setTitle("Palindrome Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        inputField = new JTextField();
        inputField.setBounds(50, 20, 200, 30);
        add(inputField);

        
        checkButton = new JButton("Check");
        checkButton.setBounds(100, 60, 100, 30);
        add(checkButton);

        
        resultLabel = new JLabel();
        resultLabel.setBounds(50, 100, 200, 30);
        add(resultLabel);

       
        checkButton.addActionListener(e -> checkPalindrome());

        setVisible(true); 
    }

    private void checkPalindrome() {
        String input = inputField.getText();
        String reversed = new StringBuilder(input).reverse().toString(); 
        if (input.equals(reversed)) {
            resultLabel.setText("Yes"); 
        } else {
            resultLabel.setText("No");
        }
    }

    public static void main(String[] args) {
        new PalindromeChecker(); 
    }
}

        
        
