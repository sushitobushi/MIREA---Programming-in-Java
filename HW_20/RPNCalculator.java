import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class RPNCalculator extends JFrame {

    private JTextField textField;

    public RPNCalculator() {
        super("RPN Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the text field
        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        // Create number buttons
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        // Create clear button
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        // Create layout
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(textField, BorderLayout.NORTH);
        contentPane.add(buttonPanel, BorderLayout.CENTER);
        contentPane.add(clearButton, BorderLayout.SOUTH);

        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null); // Center the frame
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();
    
            if (buttonText.equals("=")) {
                evaluateExpression();
            } else {
                // Add spaces between all numbers and operators
                String currentText = textField.getText().trim();
                if (!currentText.isEmpty() && !currentText.endsWith(" ")) {
                    textField.setText(currentText + " " + buttonText + " ");
                } else {
                    textField.setText(currentText + buttonText + " ");
                }
            }
        }
    }    

    private void evaluateExpression() {
        String expression = textField.getText();
        try {
            double result = evaluateRPN(expression);
            textField.setText(Double.toString(result));
        } catch (Exception e) {
            textField.setText("Error");
        }
    }

    private double evaluateRPN(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }

        return stack.pop();
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RPNCalculator().setVisible(true));
    }
}
