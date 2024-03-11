import java.util.Arrays;

public class Triangulo {

    public double A, B, C;
    public Triangulo(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Triangulo(){

    }

    public void setLados(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double[]  ordenarLados(){
        double[] lados = {A, B, C};
        Arrays.sort(lados);

        return lados;
    }

    public boolean formaTriangulo(double[] ladosOrdenados){
        double maiorLado = ladosOrdenados[2];
        double lado1 = ladosOrdenados[1];
        double lado2 = ladosOrdenados[0];

        return (maiorLado < lado1 + lado2);
    }

    public String verificarTipoTriangulo(double[] ladosOrdenados) {
        // Verifica se é equilátero
        if (A == B && B == C) {
            return "TRIANGULO EQUILATERO";
        }

        // Verifica se é isósceles
        if (A == B || A == C || B == C) {
            return "TRIANGULO ISOSCELES";
        }

        // Verifica o tipo de triângulo
        if (Math.pow(ladosOrdenados[2], 2) == Math.pow(ladosOrdenados[1], 2) + Math.pow(ladosOrdenados[0], 2)) {
            return "TRIANGULO RETANGULO";
        } else if (Math.pow(ladosOrdenados[2], 2) > Math.pow(ladosOrdenados[1], 2) + Math.pow(ladosOrdenados[0], 2)) {
            return "TRIANGULO OBTUSANGULO";
        } else if (Math.pow(ladosOrdenados[2], 2) < Math.pow(ladosOrdenados[1], 2) + Math.pow(ladosOrdenados[0], 2)) {
            return "TRIANGULO ACUTANGULO";
        }

        return "Nao foi possivel determinar o tipo de triangulo.";
    }

    public void onlyPositiveNumbers(double... numbers){
        for (double number : numbers) {
            if (number <= 0) {
                throw new IllegalArgumentException("All numbers must be positive.");
            }
        }
    }
}
