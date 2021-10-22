package com.pb.ozernyi.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int sum = 0;
        int pos = 0;
        boolean isSorted = false;
        int buf;
        System.out.println("Введите 10 целых чисел:");
        for (int i = 0; i < array.length; i++) {
           array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int num : array) {
        sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                pos++;
            }
        }
        System.out.println("Количество положительных элементов: " + pos);
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
