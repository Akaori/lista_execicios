package lista3;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = input.nextLine();

        System.out.println("Digite o número de horas trabalhadas por mês:");
        int horas = input.nextInt();

        System.out.println("Digite o valor da hora:");
        double valor = input.nextDouble();

        input.close();

        double resultado = calcularSalarioAnual(nome, horas, valor);

        System.out.printf("O salário anual de %s é: %.2f%n", nome, resultado);
    }

    public static double calcularSalarioAnual(String nome, int horas, double valorHora) {
        double salarioMensal = horas * valorHora;
        return salarioMensal * 12;
    }
}
