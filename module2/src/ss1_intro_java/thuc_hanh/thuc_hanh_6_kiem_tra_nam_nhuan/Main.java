package ss1_intro_java.thuc_hanh.thuc_hanh_6_kiem_tra_nam_nhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is a NOT leap year", year);
        }
    }
}
