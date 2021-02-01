package instrumentosmusicais;

/**
 *
 * @author Liz
 */
public class InstrumentosMusicais {
    public static void main(String[] args) {
        Violao guitar = new Violao();
        FlautaDoce flute = new FlautaDoce();
        
        System.out.println(".: Pegando o Violão :.");
        System.out.println(guitar.afinar());
        System.out.println(guitar.tocar("Apenas um Clichê  - Maglore"));
        
        System.out.println("\n.: Pegando a Flauta Doce :.");
        System.out.println(flute.afinar());
        System.out.println(flute.tocar("My Heart Will Go On  - Celine Dion"));
    }
}
