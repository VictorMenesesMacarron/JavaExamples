package inputs;

import java.util.Scanner;

public class InputsExamples {
    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        System.out.println("El resultado es " + num1 / num2);

    }
}
