import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorGrid extends JFrame implements ActionListener {
    JTextField display = new JTextField();
    double first = 0;
    String operator = "";
    boolean newInput = true;

    CalculatorGrid() {
        setTitle("Calculator");
        setLayout(new BorderLayout(5, 5));

        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 26));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] labels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+"};
        for (String label : labels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }
        add(panel, BorderLayout.CENTER);

        setSize(320, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.matches("[0-9]")) {
            if (newInput) {
                display.setText(cmd);
                newInput = false;
            } else {
                display.setText(display.getText() + cmd);
            }
        } else if (cmd.equals("C")) {
            display.setText("");
            first = 0;
            operator = "";
            newInput = true;
        } else if (cmd.equals("=")) {
            if (!operator.isEmpty() && !display.getText().isEmpty()) {
                double second = Double.parseDouble(display.getText());
                display.setText(format(compute(first, second, operator)));
                operator = "";
                newInput = true;
            }
        } else if (!display.getText().isEmpty()) {
            first = Double.parseDouble(display.getText());
            operator = cmd;
            newInput = true;
        }
    }

    double compute(double a, double b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return b;
        }
    }

    String format(double value) {
        if (value == (long) value) {
            return String.valueOf((long) value);
        }
        return String.valueOf(value);
    }

    public static void main(String[] args) {
        new CalculatorGrid();
    }
}
