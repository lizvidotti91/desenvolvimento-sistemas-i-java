package ditadospopulares;

import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author Liz
 */
public class DitadosPopulares {
    // Usando o Map do Java, construí uma lista de ditados do Chaves, e peço para que o programa exiba um ditado em ordem aleatória
    public static void main(String[] args) {
        Ditado d1 = new Ditado("MADRUGA, Seu", "A vingança nunca é plena, mata a alma e a envenena");
        Ditado d2 = new Ditado( "CHAVES", "E esse é de laranja que parece de limão, mas tem gosto de tamarindo");
        Ditado d3 = new Ditado("CHAVES", "Já chegou o Disco Voador");
        Ditado d4 = new Ditado("CHAVES", "Volta o cão arrependido, com suas orelhas tão fartas, com seu osso roído e com o rabo entre as patas");
        Ditado d5 = new Ditado("FLORINDA, Dona", "Não quer entrar e tomar uma xícara de café?");
        Ditado d6 = new Ditado("GIRAFALES, Professor", "Só errei uma vez na minha vida: quando pensei estar enganado");
        
        Map<Integer, Ditado> lista = new HashMap<Integer, Ditado>();
        lista.put(1, d1);
        lista.put(2, d2);
        lista.put(3, d3);
        lista.put(4, d4);
        lista.put(5, d5);
        lista.put(6, d6);
        
        int posicao = (int) (Math.random()*(lista.size() + 1));
        System.out.println(lista.get(posicao).getDitado());
        
    }
    
}
