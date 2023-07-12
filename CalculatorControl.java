import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculatorControl {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorControl(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(myActionListener);

    }


    ActionListener myActionListener = (e -> {
        int firstNumber, secondNumber = 0;
        try {
            firstNumber = theView.getFirstNumber();
//                theView.clearFirstNumberField();
            secondNumber = theView.getSecondNumber();
//                theView.clearSecondNumberField();
            theModel.calculateTwoValues(firstNumber, secondNumber);
            theView.setCalcSolution(theModel.getCalculationValue());
        } catch (NumberFormatException exception) {
            theView.displayErrorMessage("You Need to Enter 2 Integers");
        }
    });

}
