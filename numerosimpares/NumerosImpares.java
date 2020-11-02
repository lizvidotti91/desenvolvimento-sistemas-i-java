package numerosimpares;
public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("Números ímpares de 1 a 20:");
        for(int i = 1; i <= 20; i+=1){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("Fim da contagem");
    } 
}
