package com.company;

import java.util.Arrays;

public class Main {
    public static double arithmeticNumber = 0;

    public static void main(String[] args) {

        double[] numbers = new double[]{9.4, -2.3, 4.7, -3.9, 4.5, 6.8, 9, 3};
        double result = 0;
        int count = 0;
        int counter = 0;
        double min = 0;
        int min_i = 0;
        double temp = 0;
        int i;
        //int l = 0;

        for (double num : numbers) {

            if (num < 0) {
                count++;
            } else if (num > 0 && count > 0) {
                result = result + num;
                counter++;
                arithmeticNumber = result / counter;

            }


        }
        System.out.println(arithmeticNumber);
        System.out.println("--------------------------------");
        double[] arr = new double[]{9.4, -2.3, 4.7, -3.9, 4.5, 6.8, 9, 3};


        for (i = 0; i < arr.length; i++) {
            min = arr[i];
            min_i = i;
            // System.out.println(min);
            for (int l = i + 1; l < arr.length; l++) {
                if (arr[l] < min) {
                    min = arr[l];
                    min_i = l;
                }
            }
            if (i != min_i) {
                temp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    //System.out.println(result / numbers.length);
    //System.out.println(numbers.length);
    //System.out.println(result);


}

