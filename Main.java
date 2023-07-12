public class Main {
    public static void main(String[] args) {
        // Version 2
        CalculatorModel theModel = new CalculatorModel();
        CalculatorView theView = new CalculatorView();
        CalculatorControl theController = new CalculatorControl(theView, theModel);

    }

}
