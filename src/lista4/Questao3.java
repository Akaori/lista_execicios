package lista4;

import java.util.Arrays;

public class Questao3 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int[] resultado = somaAcumulada(nums);

        System.out.println(Arrays.toString(resultado));
    }

    public static int[] somaAcumulada(int[] nums) {
        int[] resultado = new int[nums.length];

        resultado[0] = nums[0];

        for (int i=1; i < nums.length; i++) {
            resultado[i] = nums[i] + resultado[i - 1];
        }

        return resultado;
    }
}
