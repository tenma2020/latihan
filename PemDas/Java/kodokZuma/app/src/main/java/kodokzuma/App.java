/*
 * This source file was generated by the Gradle 'init' task
 */
package kodokzuma;

import java.util.Scanner;

public class App {
    static int maxLine = 30;
    static String[] ballLine = new String[maxLine];
    static String[] balls = { "@", "&", "*", "+", "-" };
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Kodok Zuma Burique Edition");
        System.out.println();
        System.out.println("TIF-D Productions");
        System.out.println("==============================");
        while (true) {
            System.out.println("==============================");
            System.out.println("1. Play Game");
            System.out.println("2. Exit");
            System.out.println("==============================");
            int choice = in.nextInt();

            if (choice == 1) {
                System.out.println("==============================");
                System.out.println("Game Start!");
                System.out.println("==============================");

                do {
                    System.out.print("[");
                    for (int i = 0; i < ballLine.length; i++){
                        System.out.print(i);
                    }
                    System.out.println("]");

                    System.out.println("Your ball: ");
                    int i = in.nextInt();
                } while (ballLine.length == maxLine);
            } else if (choice == 2) {
                in.close();
                System.out.println("Thank You!");
            } else {
                System.err.println("Error Input!");
                System.out.println();
            }
        }
    }
}
