package geometriamain;

/**
 *
 * @author Liz
 */
public class Circulo {
    private double raio;
    private static double pi = 3.14;
    
    public void Circulo(double raio){
        this.raio = raio;
    }
    
    public double calcularArea(){
        return pi *(Math.pow(this.raio, 2));
    }
    
    public double calcularCircunferencia(){
        return 2* pi * this.raio;
    }
    
    public static double atualizarPi(double pi){
        Circulo.pi = pi;
        return Circulo.pi;
    }
}
