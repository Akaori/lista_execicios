package lista2;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o número inteiro\n");
        int X = input.nextInt();

        int resultado = 1;

        for (int i=X; i >= 1; i--) {
            resultado *= i;
        }

        System.out.println("A fatorial é: " + resultado);
    }
}
