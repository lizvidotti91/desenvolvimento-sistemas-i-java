package geometriamain;

/**
 *
 * @author Liz
 */
public class Quadrado {
    private double lado;
    private static double raiz = 1.41f;
    
    public void Quadrado(double lado){
        this.lado = lado;
    }
    
    public double calcularArea(){
       return this.lado * this.lado;
    }
    
    public double calcularPerimetro(){
        return 4 * this.lado;
    }
    
    public double calcularDiagonal(){
        return this.lado * Quadrado.raiz;
    }
    
    public static double atualizarDiagonal(double raiz){ //setter 
        Quadrado.raiz = raiz;
        return Quadrado.raiz;
    }
    
}
