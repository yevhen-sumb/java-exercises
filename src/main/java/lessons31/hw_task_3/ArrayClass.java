package lessons31.hw_task_3;

import java.util.Arrays;

public class ArrayClass {


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int x;
    public int[] arr = new int[x];

    public int sumArray (int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public double averageArray (int[] arr) {
        return Arrays.stream(arr).average().orElse(Double.NaN);
    }

    public int maxArray (int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public int minArray (int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

}

