package passeiemds;
import java.util.Scanner;
public class PasseiEmDS {
    public static void main(String[] args) {
         char letra = 'A';
         Scanner ler = new Scanner(System.in);
        
        while(letra != 'S' && letra != 'N'){
            System.out.println("Você vai passar em DS1?");
            letra = ler.next().charAt(0);
            
            if(letra == 'S'){
                System.out.println("Parabéns!");
            }
            if(letra == 'N'){
                System.out.println("Continue estudando!");
            }
        }
    }
}
