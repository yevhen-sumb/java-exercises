package lessons31.hw_task_2;

public class RunCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(0, 0);
        calculator.setA(222);
        calculator.setB(12);


        System.out.println("Сумма чисел составляет " + calculator.sum(calculator.getA(),calculator.getB()));
        System.out.println("Разность чисел составляет " + calculator.subtraction(calculator.getA(),calculator.getB()));
        System.out.println("Произведение чисел составляет " + calculator.multiplication(calculator.getA(),
                calculator.getB()));
        System.out.println("Результат деления " + calculator.division(calculator.getA(),calculator.getB()));
        System.out.println("Максимальное число " + calculator.maxNumber(calculator.getA(),calculator.getB()));
        System.out.println("Минимальное число " + calculator.minNumber(calculator.getA(),calculator.getB()));
        System.out.println("Процент числа А от числа В составляет " + calculator.percentNumber(calculator.getA(),
                calculator.getB()));
        System.out.println("Число А возведенное в степень В составляет " + calculator.powNumber(calculator.getA(),calculator.getB()));
    }
}
