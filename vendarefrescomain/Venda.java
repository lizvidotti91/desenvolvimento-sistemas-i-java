package vendarefrescomain;

import java.util.ArrayList;

/**
 *
 * @author Liz
 */
public class Venda {
    private double precoFinal;
    private ArrayList<Refresco> itens = new ArrayList<>();
    
    public void Venda(){
        this.precoFinal = 0.0f;
        //this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(Refresco newRefresco){
        this.itens.add(newRefresco);
        this.precoFinal += newRefresco.getPrecoUnitario();
    }
    
    // GETTERS
    public double getPrecoFinal(){
        return this.precoFinal;
    }
    
    public String getItens(){
        String dadosVenda = "Preço final Cr$ " + this.precoFinal;
        for(Refresco item : this.itens){
            dadosVenda += item.getInfoRefresco();
        }
        return dadosVenda;
    }
}
