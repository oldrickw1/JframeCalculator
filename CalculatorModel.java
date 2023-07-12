public class CalculatorModel {

    // Data
    private int calculationValue;

    // Methods related to data
    public void calculateTwoValues(int firstValue, int secondValue) {
        calculationValue = firstValue + secondValue;
    }

    // access to data
    public int getCalculationValue() {
        return calculationValue;
    }
}
