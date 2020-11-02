/*
Goku está comprando camisas online. O preço unitário da camisa que ele gostou é R$ 30,00.
Peça para Goku informar a quantidade de camisas que ele deseja comprar. Permita somente entre 1 e 5 unidades.
Não avance até uma quantidade válida seja informada.
Peça para Goku informar a sigla do Estado onde ele está. Caso seja “BA”, não há frete.
Caso seja outro Estado, o frete é de R$ 20,00.
Exiba o preço final da compra.
*/

package revisaodelogica2;

import java.util.Scanner;

public class RevisaoDeLogica2 {
    public static void main(String[] args) {
       float precoCamisa = 0;
       float quantCamisa = 0;
       float precoFinal;
       String uf;
       Scanner ler = new Scanner(System.in);
       
       System.out.println("Informe o valor da camisa");
       precoCamisa = ler.nextFloat();
       
       while(quantCamisa < 1 || quantCamisa > 5){
           System.out.println("Informe quantidade de camisas desejadas [1 a 5]");
           quantCamisa = ler.nextFloat();
       }
       
       precoFinal = precoCamisa * quantCamisa;
       
       System.out.println("Informe o seu Estado para o cálculo do frete");
       uf = ler.next();
       
       if("BA".equals(uf)){
           System.out.println("Frete grátis! Valor total R$ " + precoFinal);
       } else{
           precoFinal = precoFinal + 20;
           System.out.println("Frete de R$ 20,00. Valor total R$ " + precoFinal);
       }
    }
}
