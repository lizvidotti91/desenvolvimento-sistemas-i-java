package projetojogo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Liz
 */
public class JogoEletronico extends Jogo {
    private ArrayList<String> plataformas;
    private String categoria;
    private String[] categorias = {"Ação", "Esporte", "Estratégia"};
    
    public JogoEletronico(String nome, float precoUnitario, int classEtaria, ArrayList plataformas, int numCategoria){
        super.Jogo(nome, precoUnitario, classEtaria);
        this.plataformas = plataformas;
        this.categoria = this.categorias[numCategoria];
    }
    
    public String getPlataformas(){
        String res = "Plataformas: ";
        Collections.sort(plataformas);
        for(String item : plataformas){
            res += item + "; ";
        }
        return res;
    }
    
    @Override
    public String toString(){
        return super.toString() + " | Categoria: " + this.categoria;
    }
}
