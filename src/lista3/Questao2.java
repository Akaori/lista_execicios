package lista3;

import java.util.Scanner;


public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura atual:");
        double tempAtual = input.nextDouble();

        System.out.println("Digite a medida atual (celsius, fahrenheit ou kelvin):");
        String medidaAtual = input.next().toLowerCase();

        System.out.println("Digite a medida final (celsius, fahrenheit ou kelvin):");
        String medidaFinal = input.next().toLowerCase();

        input.close();

        double resultado = converterTemperatura(tempAtual, medidaAtual, medidaFinal);

        if (!Double.isNaN(resultado)) {
            System.out.println("O resultado da conversão é: " + resultado);
        }
    }

    public static double converterTemperatura(double tempAtual, String medidaAtual, String medidaFinal) {
        double resultado = 0.0;

        switch (medidaAtual) {
            case "celsius" -> {
                if (medidaFinal.equals("fahrenheit")) {
                    resultado = tempAtual * 9 / 5 + 32;
                } else if (medidaFinal.equals("kelvin")) {
                    resultado = tempAtual + 273.15;
                } else {
                    resultado = tempAtual;
                }
            }
            case "fahrenheit" -> {
                if (medidaFinal.equals("celsius")) {
                    resultado = (tempAtual - 32) * 5 / 9;
                } else if (medidaFinal.equals("kelvin")) {
                    resultado = (tempAtual + 459.67) * 5 / 9;
                } else {
                    resultado = tempAtual;
                }
            }
            case "kelvin" -> {
                if (medidaFinal.equals("celsius")) {
                    resultado = tempAtual - 273.15;
                } else if (medidaFinal.equals("fahrenheit")) {
                    resultado = tempAtual * 9 / 5 - 459.67;
                } else {
                    resultado = tempAtual;
                }
            }
            default -> {
                System.out.println("Medida atual inválida!");
                return Double.NaN;
            }
        }
        return resultado;
    }
}
