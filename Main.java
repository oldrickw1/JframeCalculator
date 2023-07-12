public class Main {
    public static void main(String[] args) {
        CalculatorModel theModel = new CalculatorModel();
        CalculatorView theView = new CalculatorView();
        CalculatorControl theController = new CalculatorControl(theView, theModel);

    }

}
