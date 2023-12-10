package lista1;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu peso ? (Em Kg)");
        double peso = input.nextDouble();

        System.out.println("Qual a sua altura ? (Em metros)");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O IMC é: %.2f", imc);

        input.close();
    }
}
