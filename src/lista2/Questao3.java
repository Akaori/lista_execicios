package lista2;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas para calcular:");
        int quantidadeDeNotas = input.nextInt();

        if (quantidadeDeNotas <= 0) {
            System.out.println("Quantidade inválida!");
        } else {
            double[] notas = new double[quantidadeDeNotas];

            double soma = 0.0;

            for (int i = 0; i < quantidadeDeNotas; i++) {
                System.out.println("Digite a nota " + (i + 1) + ":");
                notas[i] = input.nextDouble();

                soma += notas[i];
            }
            input.close();

            double media = soma / quantidadeDeNotas;

            System.out.println("A média das notas é: " + media);
        }
    }
}
