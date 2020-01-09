package section1;

import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        int n, max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array limit");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value is " + max);
        System.out.println("Minimum value is " + min);
        sc.close();
    }

}
