package lista3;

public class Questao3 {

    public static void main(String[] args) {
        // Modulo 01
        // Memoria disponivel: 3 bytes
        short anoAtualDaMissao = 9999;  // 2 byte
        byte qtdFuncionarios = 100;  // 1 byte

        // Modulo 02
        // Memoria disponivel: 6 bytes
        int distanciaSatelite = 2000000;  // 4 bytes
        short velocidadeMaxima = 30000;  // 2 bytes

        // Modulo 03
        // Memoria disponivel: 17 bytes
        boolean iniciouMissao = true; // 1 bit
        long distanciaPercorrida = 3_000_000_000L; //8 bytes
        double calibragemAntenas = 1.12345678912345; // 8 bytes
    }
}
