package lista4;

public class Questao5 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1};

        int pivot = -1;
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) {
                pivot = i;
                break;
            } else {
                leftSum += nums[i];
            }
        }

        if (pivot != -1) {
            System.out.println("O índice pivô da matriz é " + pivot + ".");
        } else {
            System.out.println("Não existe índice pivô na matriz.");
        }
    }
}
