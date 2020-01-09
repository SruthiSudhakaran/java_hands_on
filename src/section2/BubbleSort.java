package section2;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        int n=10;
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if(arr[j-1] >arr[j]) {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

}
