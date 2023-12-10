package lista2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o número inteiro\n");
        int X = input.nextInt();

        if (X % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (X >= 2 && X <= 5) {
                System.out.println("Not Weird");
            } else if (X >= 6 && X <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}
