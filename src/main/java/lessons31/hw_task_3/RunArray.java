package lessons31.hw_task_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RunArray {

    public static void main(String[] args) {
        ArrayClass arrayClass = new ArrayClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        arrayClass.setX(scanner.nextInt());

        arrayClass.arr = new int [arrayClass.getX()];
        for (int i = 0; i < arrayClass.arr.length; i++) {
            arrayClass.arr[i] = (int) ((Math.random() * 100));
        }

        System.out.println(Arrays.toString(arrayClass.arr));
        System.out.println("Сумма всех элементов массива равна " + arrayClass.sumArray(arrayClass.arr));
        System.out.println("Среднее арифметическое всех элементов массива равно " + arrayClass.averageArray(arrayClass.arr));
        System.out.println("Максимальный элемент массива равен " + arrayClass.maxArray(arrayClass.arr));
        System.out.println("Минимальный элемент массива равен " + arrayClass.minArray(arrayClass.arr));
    }


    }



