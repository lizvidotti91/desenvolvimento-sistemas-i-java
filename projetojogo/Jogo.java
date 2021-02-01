package projetojogo;

/**
 *
 * @author Liz
 */
public class Jogo {
    private String nome;
    private float precoUnitario;
    private int classEtaria;
    
    public void Jogo(String nome, float precoUnitario, int classEtaria){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.classEtaria = classEtaria;
    }
    
    public String toString(){
        return "Nome: " + this.nome +
               " | Preço Un.: " + this.precoUnitario +
               " | Classificação: " + this.classEtaria;
    }
}
