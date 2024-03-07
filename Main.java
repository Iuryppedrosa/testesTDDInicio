import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário os valores dos lados do triângulo
        System.out.print("Informe o valor do lado A: ");
        double A = scanner.nextDouble();

        System.out.print("Informe o valor do lado B: ");
        double B = scanner.nextDouble();

        System.out.print("Informe o valor do lado C: ");
        double C = scanner.nextDouble();

        // Criar instância da classe Triangulo
        Triangulo triangulo = new Triangulo();
        triangulo.setLados(A, B, C);

        // Realizar os testes e exibir resultados
        double[] ladosOrdenados = triangulo.ordenarLados();
        if (triangulo.formaTriangulo(ladosOrdenados)) {
            System.out.println("Tipo de Triangulo: " + triangulo.verificarTipoTriangulo(ladosOrdenados));
        } else {
            System.out.println("Nao forma um triangulo.");
        }

        // Fechar o scanner
        scanner.close();
    }
}