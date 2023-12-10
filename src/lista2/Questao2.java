package lista2;

import java.util.Scanner;


public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("(1) - Somar");
        System.out.println("(2) - Subtrair");
        System.out.println("(3) - Dividir");
        System.out.println("(4) - Multiplicar");
        System.out.println("(5) - Resto");
        System.out.println("(6) - Raiz");
        System.out.println("(7) - Potência");

        int opcao = input.nextInt();

        double num1, num2, resultado;

        if (opcao < 1 || opcao > 7) {
            System.out.println("Opção inválida!");
        } else {
            System.out.println("Digite o primeiro número:");
            num1 = input.nextDouble();
            System.out.println("Digite o segundo número:");
            num2 = input.nextDouble();

            input.close();

            resultado = 0.0;

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    if (num2 == 0) {
                        System.out.println("Não é possível dividir por zero!");
                        return;
                    }
                    resultado = num1 / num2;
                    break;
                case 4:
                    resultado = num1 * num2;
                    break;
                case 5:
                    if (num2 == 0) {
                        System.out.println("Não é possível dividir por zero!");
                        return;
                    }
                    resultado = num1 % num2;
                    break;
                case 6:
                    if (num1 < 0) {
                        System.out.println("Não é possível calcular a raiz de um número negativo!");
                        return;
                    }
                    resultado = Math.pow(num1, 1.0 / num2);
                    break;
                case 7:
                    resultado = Math.pow(num1, num2);
                    break;
            }
            System.out.println("O resultado da operação é: " + resultado);
        }
    }
}
