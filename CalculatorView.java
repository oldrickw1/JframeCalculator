import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.security.Key;
import java.util.EventListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton(" Calculate");
    private JTextField calcSolution = new JTextField(10);

    public CalculatorView() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel calcPanel = new JPanel();
//        setLayout(null);
        setSize(600, 200);
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);

        setVisible(true);
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public void clearFirstNumberField() {
        firstNumber.setText("");
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public void clearSecondNumberField() {
        secondNumber.setText("");
    }

    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    public void addCalculationListener(EventListener listenForCalcButton) {
        calculateButton.addActionListener((ActionListener) listenForCalcButton);
    }


    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
