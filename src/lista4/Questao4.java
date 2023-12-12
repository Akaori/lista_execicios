package lista4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> votos = new HashMap<>();
        int nulos = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite o nome do candidato " + i + ":");
            String candidato = input.nextLine();
            votos.put(candidato, 0);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o seu voto " + i + ":");
            String candidato = input.nextLine();
            if (votos.containsKey(candidato)) {
                votos.put(candidato, votos.get(candidato) + 1);
            } else {
                nulos++;
            }
        }
        String vencedor = "";
        int maxVotos = 0;
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            if (entry.getValue() > maxVotos) {
                maxVotos = entry.getValue();
                vencedor = entry.getKey();
            }
        }
        double porcentagem = (double) maxVotos / (10 - nulos) * 100;
        System.out.printf("O vencedor da eleição é %s, com %d votos e %.2f%% de porcentagem.\n", vencedor, maxVotos, porcentagem);
        input.close();
    }
}
