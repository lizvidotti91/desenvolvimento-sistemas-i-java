package projetojogo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Liz
 */
public class JogoCartas extends Jogo {
    private int qtdJogadores;
    private ArrayList<String> deck;
    
    public JogoCartas(String nome, float precoUnitario, int classEtaria, int qtdJogadores, ArrayList deck){
        super.Jogo(nome, precoUnitario, classEtaria);
        this.qtdJogadores = qtdJogadores;
        this.deck = deck;
    }
    
    public String getdeck(){
        String cards = "Deck: ";        
        Collections.shuffle(deck);        
        for(String item: deck){
            cards += item + "; ";
        }
        return cards;
    }
    
    @Override
    public String toString(){
        return super.toString() + " | Quantidade de jogadores: " + this.qtdJogadores;
    }
}
