package lista3;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Questao1 {
    public static void main(String[] args) {
        System.out.println("Soma: " + somar(10, 5));
        System.out.println("Subtração: " + subtrair(10, 5));
        System.out.println("Divisão: " + dividir(10, 5));
        System.out.println("Multiplicação: " + multiplicar(10, 5));
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }
}
