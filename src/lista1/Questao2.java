package lista1;

import java.util.Scanner;


public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o seu nome?\n");
        String nome = input.nextLine();

        System.out.printf("Qual o seu sexo?%n");
        String sexo = input.nextLine();

        System.out.printf("Qual a sua idade?%n");
        int idade = Integer.parseInt(input.nextLine());

        System.out.println("Qual a sua altura?");
        double altura = Double.parseDouble(input.nextLine());

        System.out.println("Qual o seu salário?");
        double salario = Double.parseDouble(input.nextLine());

        input.close();

        System.out.printf("Nome: %s%nSexo: %s%nIdade: %d%nAltura: %.2f%nSalário: R$%.2f",
                            nome,
                            sexo,
                            idade,
                            altura,
                            salario
                );
    }
}
