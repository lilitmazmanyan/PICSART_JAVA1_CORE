import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //Task 1
        int m = 7, n = 8;
        int[] a = new int[]{m, n};

        //Task 2
        int[] b = new int[1000];
        for (int i = 0; i < 1000; i++) {
            b[i] = i + 1;
        }

        //Task 3
        int[] odds = new int[10];
        for (int i = -20, index = 0; i < 20; i += 2) {
            odds[index] = i;
        }

        //Task 4
        System.out.println("TASK 4 : Print all elements which can be divided by 5");
        for (int i = 0; i < b.length / 10; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }
        System.out.println("\b\b\n......................................");
        //Task 5
        System.out.println("TASK 5 : Print all elements which are between 24.12 and 467.23");
        double[] k = new double[20];
        int count = 0;
        while (count < k.length) {
            k[count] = randomFill();
            count++;
        }
        System.out.println("Initial array is: " + Arrays.toString(k));
        for (double i : k) {
            if (i > 24.12 && i < 467.23) {
                System.out.print(i + ' ');
            }
        }
        System.out.println("\n......................................");
        //Task 6
        System.out.println("TASK 6 : Print count of elements which can be divided by 2");
        int countOfEvens = 0;
        for (int i : b) {
            if (i % 2 == 0) countOfEvens++;
        }
        System.out.println(countOfEvens);

        System.out.println("......................................");

        //task 7
        System.out.println("TASK 7 : Given an integer, 0< N < 21 , print its first 10 multiples");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number preferably between 1 and 20");
        int jkl = s.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", i, jkl, i * jkl);
        }
    }

    public static double randomFill() {
        return ((double) Math.round(new Random().nextDouble() * 100000)) / 100;
    }
}