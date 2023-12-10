package lista4;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Questao1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

        int[] resultado = concatenarArrays(arr1, arr2);

        System.out.println(Arrays.toString(resultado));
    }

    public static int[] concatenarArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            System.out.println("Arrays inválidas!");
            return null;
        }

        int tamanho = arr1.length;
        int[] resultado = new int[tamanho * 2];

        for (int i = 0; i < tamanho; i++) {
            resultado[2 * i] = arr1[i];
            resultado[2 * i + 1] = arr2[i];
        }
        return resultado;
    }
}
