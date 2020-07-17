package lessons31.hw_task_1;

public class TestFractions {
    public  void Test () {
        double a = 0.85;
        double b = 0.15;

        CalculatorFractions calc = new CalculatorFractions();
        double res = calc.sumFractions(a, b);
        System.out.println("Сумма равна" + " " + res);

        CalculatorFractions calc1 = new CalculatorFractions();
        double res1 = calc1.subtractionFractions(a, b);
        System.out.println("Разница равна" + " " + res1);

        CalculatorFractions calc2 = new CalculatorFractions();
        double res2 = calc1.divisionFractions(a, b);
        System.out.println("Частное равно" + " " + res2);

        CalculatorFractions calc3 = new CalculatorFractions();
        double res3 = calc1.multiplicationFractions(a, b);
        System.out.println("Произведение  равно" + " " + res3);
    }

}
