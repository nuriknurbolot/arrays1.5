package com.company;

public class Main {

    public static void main(String[] args) {
        // задание 1
        int[] arrays = new int[3];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;
        double[] weights = {1.57, 7.654, 9.986};
        int[] subjectWeek = {7, 8, 9};
        // задание 2
        System.out.print(arrays[0] + ",");
        System.out.print(arrays[1] + ",");
        System.out.println(arrays[2]);
        System.out.print(weights[0] + ",");
        System.out.print(weights[1] + ",");
        System.out.println(weights[2]);
        System.out.println(subjectWeek[0] + "," + subjectWeek[1] + "," + subjectWeek[2]);
        // задание 3
        System.out.print(arrays[2] + ",");
        System.out.print(arrays[1] + ",");
        System.out.println(arrays[0]);
        System.out.print(weights[2] + ",");
        System.out.print(weights[1] + ",");
        System.out.println(weights[0]);
        System.out.println(+subjectWeek[2] + "," + subjectWeek[1] + "," + subjectWeek[0]);
        // задание 4
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                arrays[i] = i + 2;
                System.out.print(arrays[i]+" ");
            } else if (arrays[i] % 2 == 0) System.out.print(arrays[i] + " ");
        }
    }
}

