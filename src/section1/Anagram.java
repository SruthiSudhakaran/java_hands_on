package section1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1 = sc.nextLine();
        System.out.println("Enter second string");
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase().replaceAll(" ", "");
        s2 = s2.toLowerCase().replaceAll(" ", "");
        if (check(s1, s2)) {
            System.out.println("Is Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        sc.close();
    }

    public static boolean check(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return (Arrays.equals(arr1, arr2));
        }
    }
}
