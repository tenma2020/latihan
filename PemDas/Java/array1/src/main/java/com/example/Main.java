package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[100];
        System.out.println("use looping to add value:");
            for (int i = 99; i > 0; i--) {
                array[i] = i;
                System.out.println(array[i]);
            }
        System.out.println();
        System.out.println("use scanner to add value:");
        System.out.println();
        System.out.println("enter total value (from 0 to 100):");
        int total = in.nextInt();
        for (int t = 0; t < total; t++) {
            array[t] =  t;
            System.out.println(array[t]);
        }

        System.out.println("random shuffling");
        double[] myList = new double[20];
        for (int i = 0; i < total; i++) {
            myList[i] = i;
        }
        for (int i = myList.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
            System.out.println(myList[i]);
        }
        in.close();
        }
    }
