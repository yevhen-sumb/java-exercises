package lessons31.hw_task_1;

import java.math.BigDecimal;

public class CalculatorFractions {


    public double sumFractions(double a, double b) {
        return a + b;
    }

    public double subtractionFractions(double a, double b) {
        return a - b;
    }

    public double divisionFractions(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Делить на 0 - НЕЛЬЗЯ!!!");
            return Double.NaN;
        }
    }


    public double multiplicationFractions(double a, double b) {
        return a * b;

    }


}














