package lista3;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = input.nextInt();

        int fatorial = calcularFatorial(num);

        System.out.println("O fatorial é " + fatorial);
    }

    public static int calcularFatorial(int num) {
        int resultado = 1;

        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }

}
