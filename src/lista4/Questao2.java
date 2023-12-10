package lista4;

import java.util.Scanner;


public class Questao2 {
    public static void main(String[] args) {
        int[][] turma = {
                {9, 8, 7, 8},
                {10, 9, 8, 9},
                {9, 8, 7, 8}
        };

        int numAlunos = turma.length;

        int numNotas = turma[0].length;

        int somaTurma = 0;

        for (int i = 0; i < numAlunos; i++) {
            int somaAluno = 0;

            for (int j = 0; j < numNotas; j++) {
                somaAluno += turma[i][j];
            }

            double mediaAluno = (double) somaAluno / numNotas;

            System.out.printf("Aluno %d - Média %.1f\n", i, mediaAluno);

            somaTurma += somaAluno;
        }

        double mediaTurma = (double) somaTurma / (numAlunos * numNotas);

        System.out.printf("Média da turma: %.2f\n", mediaTurma);
    }
}
