package projetojogo;

import java.util.ArrayList;

/**
 *
 * @author Liz
 */
public class ProjetoJogo {
    public static void main(String[] args) {
        // Criando um ArrayList para as cartas do deck
        ArrayList<String> cartas = new ArrayList<>();
        cartas.add("Às de Copas");
        cartas.add("Dama de Copas");
        cartas.add("Rei de Copas");
        cartas.add("Valete de Copas");
        
        // Criando um objeto da classe JogoCartas
        JogoCartas jc = new JogoCartas("Baralho", 20.0f, 7, 4, cartas);
        
        // Saídas
        System.out.println(jc.toString());
        System.out.println(jc.getdeck());
        
        // Criando um ArrayList para as plataformas de videogame
        ArrayList<String> plataformas = new ArrayList<>();
        plataformas.add("Xbox");
        plataformas.add("Windows");
        plataformas.add("PlayStation");
        
        // Criando um objeto da classe JogoEletronico
        JogoEletronico je = new JogoEletronico("GTA V", 150.f, 18, plataformas, 0);
        
        // Saídas
        System.out.println(je.toString());
        System.out.println(je.getPlataformas());
    }  
}
