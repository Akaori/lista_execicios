package lista3;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem (em horas):");
        double tempo = input.nextDouble();

        System.out.println("Digite a velocidade média durante a viagem (em km/h):");
        double velocidade = input.nextDouble();

        input.close();

        double litros = calcularCombustivel(tempo, velocidade);

        System.out.printf("A quantidade de litros de combustível gastos na viagem foi: %.3f\n", litros);
    }

    public static double calcularCombustivel(double tempo, double velocidade) {
        double distancia = tempo * velocidade;
        return distancia / 12;
    }
}
