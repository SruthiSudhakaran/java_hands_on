package section2;

import java.util.Scanner;

public class TaxCalcAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Annual Salary");
        double base = 300000;
        double tax = 0;
        double salary = sc.nextLong();
        if (salary <= base) {
            System.out.println("No Tax");
        } else if (salary >= 300001 && salary <= 500000) {
            double a = salary - base;
            tax = (a * 5) / 100;
            System.out.printf("Tax amount :%.2f", tax);
        } else if (salary >= 500001 && salary <= 1000000) {
            double a = salary - 500000;
            tax = (250000 * 5) / 100;
            double tax2 = (a * 20) / 100;
            System.out.printf("Tax amount :%.2f", (tax + tax2));
        } else {
            double a = salary - 1000000;
            tax = (250000 * 5) / 100;
            double tax2 = (500000 * 20) / 100;
            double tax3 = (a * 30) / 100;
            System.out.printf("Tax amount :%.2f", (tax + tax2 + tax3));
        }
        sc.close();
    }

}
