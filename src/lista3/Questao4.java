package lista3;

public class Questao4 {

    public static void main(String[] args) {

        double baseRetangulo = 5;
        double alturaRetangulo = 10;
        double areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.printf("A área do retângulo é: %.2f%n", areaRetangulo);

        double baseTriangulo = 5;
        double alturaTriangulo = 10;
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.printf("A área do triângulo é: %.2f%n", areaTriangulo);


        double raioCirculo = 15;
        double areaCirculo = Math.PI * raioCirculo * raioCirculo;
        System.out.printf("A área do círculo é: %.2f%n", areaCirculo);

        double baseMaior = 15;
        double baseMenor = 10;
        double altura = 5;
        double areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
        System.out.printf("A área do trapézio é: %.2f%n", areaTrapezio);

    }
}
