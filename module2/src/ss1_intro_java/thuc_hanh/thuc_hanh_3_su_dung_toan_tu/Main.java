package ss1_intro_java.thuc_hanh.thuc_hanh_3_su_dung_toan_tu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
