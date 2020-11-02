package geometriamain;

/**
 *
 * @author Liz
 */
public class GeometriaMain {

        public static void main(String[] args) {
            
            // instanciando os objetos
            Quadrado quad = new Quadrado();
            Circulo circ = new Circulo();
            
            quad.Quadrado(2); // passando o valor do lado do quadrado
            circ.Circulo(3); // passando o valor do raio do círculo
            
            // Imprimindo valores de área e perímetro do quadrado
            System.out.println("========== QUADRADO ==========");
            System.out.println("Área do quadrado: " + quad.calcularArea());
            System.out.println("Perímetro do quadrado: " + quad.calcularPerimetro());
            System.out.println("Diagonal do quadrado: " + quad.calcularDiagonal());
            System.out.println("Atualizando valor da raiz de 2: " + Quadrado.atualizarDiagonal(Math.sqrt(2)));
            System.out.println("Novo valor da diagonal do quadrado: " + quad.calcularDiagonal());
            
            // Imprimindo valores de área e comprimento do círculo
            System.out.println("========== CÍRCULO ==========");
            System.out.println("Área do círculo: " + circ.calcularArea());
            System.out.println("Comprimento do círculo: " + circ.calcularCircunferencia());
            System.out.println("Atualizando o valor de PI: " + Circulo.atualizarPi(Math.PI));
            System.out.println("Novo valor da área do círculo: " + circ.calcularArea());
            System.out.println("Novo valor do comprimento do círculo: " + circ.calcularCircunferencia());
    }
    
}
