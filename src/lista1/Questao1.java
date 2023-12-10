package lista1;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o seu nome?\n");
        String nome = input.nextLine();

        System.out.printf("Qual a sua idade?%n");
        int idade = parseInt(input.nextLine());

        System.out.println("Qual a sua profissão?");
        String profissao = input.nextLine();
    }
}
