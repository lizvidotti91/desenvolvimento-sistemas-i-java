package vendarefrescomain;

/**
 *
 * @author Liz
 */
public class Fabricante {
    private String nome;
    private String ceo;
    private int anoFundacao;
    
    public void Fabricante(String nome, String ceo, int anoFundacao){
        this.nome = nome;
        this.ceo = ceo;
        this.anoFundacao = anoFundacao;
    }
    
    public String getInfoFabricante(){
        return "Fabricante: " + this.nome +
               "\nAno de Fundação: " + this.anoFundacao +
               "\nCEO: " + this.ceo;
    }
}
