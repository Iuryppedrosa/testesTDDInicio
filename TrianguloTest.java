import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void verificarTipoTriangulo_Equilatero() {
        Triangulo triangulo = new Triangulo(10.0, 10.0, 10.0);
        double[] lados = triangulo.ordenarLados();
        String tipo = triangulo.verificarTipoTriangulo(lados);
        assertEquals("TRIANGULO EQUILATERO", tipo);
    }

    @Test
    void verificarTipoTriangulo_Isosceles() {
        Triangulo triangulo = new Triangulo(10.0, 10.0, 5.0);
        double[] lados = triangulo.ordenarLados();
        String tipo = triangulo.verificarTipoTriangulo(lados);
        assertEquals("TRIANGULO ISOSCELES", tipo);
    }

    @Test
    void verificarTipoTriangulo_Retangulo() {
        Triangulo triangulo = new Triangulo(10.0, 5.0, 5.0);
        double[] lados = triangulo.ordenarLados();
        String tipo = triangulo.verificarTipoTriangulo(lados);
        assertEquals("TRIANGULO RETANGULO", tipo);
    }

    @Test
    void verificarTipoTriangulo_Obtusangulo() {
        Triangulo triangulo = new Triangulo(10.0, 15.0, 5.0);
        double[] lados = triangulo.ordenarLados();
        String tipo = triangulo.verificarTipoTriangulo(lados);
        assertEquals("TRIANGULO OBTUSANGULO", tipo);
    }

    @Test
    void verificarTipoTriangulo_Acutangulo() {
        Triangulo triangulo = new Triangulo(15.0, 10.0, 5.0);
        double[] lados = triangulo.ordenarLados();
        String tipo = triangulo.verificarTipoTriangulo(lados);
        assertEquals("TRIANGULO ACUTANGULO", tipo);
    }

    @Test
    void verificarTipoTriangulo_Invalido() {
        Triangulo triangulo = new Triangulo(10.0, 15.0, 10.0);
        double[] lados = triangulo.ordenarLados();
        String tipo = triangulo.verificarTipoTriangulo(lados);
        assertNotEquals("Nao foi possivel determinar o tipo de triangulo.", tipo);
    }
}
