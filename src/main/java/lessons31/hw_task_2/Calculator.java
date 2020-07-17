package lessons31.hw_task_2;




public class Calculator {
    int a;
    int b;


    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum(int a, int b) {

        return a + b;
    }


    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication (int a, int b) {
        return a * b;

    }

    public double division (int a, int b) {
        if (b == 0) {
            System.out.println("НЕЛЬЗЯ ДЕЛИТЬ НА 0 !!!");
        }
        return (double) a / (double) b;
    }

    public int maxNumber (int a, int b) {
        return Math.max(a, b);

    }

    public int minNumber (int a, int b) {
        return Math.min(a, b);


    }

    public double percentNumber (int a, int b) {
        if (b == 0) {
            System.out.println("ДЕЛИТЬ НА НОЛЬ НЕЛЬЗЯ, ИЗМЕНИТЕ ЧИСЛО !!!");
        }
        return ((double) a / (double) b * 100);
    }

    public int powNumber (int a, int b) {
        double pow = Math.pow(a, b);
        return (int) pow;
    }


}
