package HomeWorkOfLecture4;

import java.util.Scanner;

public class Lecture4 {

    public static void main(String[] args) {
        thirdProblem();
        fourthProblem();
        sixthProblem();
        fifthProblem();
        getInputNumber();
    }

    private static void sixthProblem() {
        int Size, i, OddSum = 0;
        Scanner Scanner = new Scanner(System.in);

        System.out.print(" Please Enter Number of elements in an array : ");
        Size = Scanner.nextInt();
        int[] a = new int[Size];

        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (i = 0; i < Size; i++) {
            a[i] = Scanner.nextInt();
        }
        for (i = 0; i < Size; i++) {
            if (a[i] % 3 == 0) {
                OddSum = OddSum + a[i];
            }
        }
        System.out.println("The Sum of Odd Numbers in  Array = " + OddSum);
    }

    private static void fifthProblem() {
        int Size, i, EvenSum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please Enter Number of elements in an array : ");
        Size = scanner.nextInt();

        int[] a = new int[Size];

        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (i = 0; i < Size; i++) {
            a[i] = scanner.nextInt();
        }

        for (i = 0; i < Size; i++) {
            if (a[i] % 2 == 0) {
                EvenSum = EvenSum + a[i];
            }
        }
        System.out.println(" The Sum of Even Numbers in Array = " + EvenSum);
    }

    private static void getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
    }

    private static void fourthProblem() {
        int[] arr = new int[]{12, 34, 45, 21, 33, 4, 12, 2, 3, 76};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Array Sum = " + sum);
    }

    private static void thirdProblem() {
        int Size, i, evenCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please Enter Number of elements in an array : ");
        Size = scanner.nextInt();

        int[] a = new int[Size];

        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (i = 0; i < Size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("List of Even Numbers in this Array are :");
        for (i = 0; i < Size; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                evenCount++;
            }
        }
        System.out.println(" Total Number of Even Numbers in this Array = " + evenCount);
    }
}
