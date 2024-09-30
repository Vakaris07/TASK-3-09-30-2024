//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter numbers, in order to end enter -1: ");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            num = sc.nextInt();
            if (num > max && num != -1) {
                max = num;
            }
            if (num < min && num != -1) {
                min = num;
            }
        } while (num != -1);

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
