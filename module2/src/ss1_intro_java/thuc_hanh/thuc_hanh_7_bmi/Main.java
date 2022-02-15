package ss1_intro_java.thuc_hanh.thuc_hanh_7_bmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight(kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Enter height(m): ");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
//        System.out.println("bmi = " + bmi);
//        if (bmi>=30){
//            System.out.println("Obese");
//        } else if (bmi>=25){
//            System.out.println("Overweight");
//        } else if (bmi >= 18.5){
//            System.out.println("Normal");
//        } else {
//            System.out.println("Underweight");
//        }
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
