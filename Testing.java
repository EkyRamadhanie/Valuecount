package testing;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Give a number to know your grade:");
            int val = sc.nextInt();
            String grade;

            if (val >= 80) {
                grade = "A";
            } else if (val >= 77) {
                grade = "A-";
            } else if (val >= 75) {
                grade = "B+";
            } else if (val >= 70) {
                grade = "B";
            } else if (val >= 67) {
                grade = "B-";
            } else if (val >= 64) {
                grade = "C+";
            } else if (val >= 60) {
                grade = "C";
            } else if (val >= 50) {
                grade = "D+";
            } else if (val >= 40) {
                grade = "D";
            } else {
                grade = "E";
            }
            System.out.println("Your value is : " + grade);

            System.out.print("Give value again? (yes/no):");
            ulang = sc.next();

        } while (ulang.equalsIgnoreCase("yes"));

    }

}
