package lista2;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o número inteiro\n");
        int X = input.nextInt();

        input.close();

        for (int i=1; i <=10; i++) {
            int resultado = X * i;
            System.out.printf("%d X %d = %d%n", X, i, resultado);
        }
    }
}
