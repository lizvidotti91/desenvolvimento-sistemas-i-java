package operacaoaritmetica;

import java.util.Scanner;

public class OperacaoAritmetica {
    
    static float soma(float n1, float n2){
        return n1+n2; 
    }
    
    static float subtracao(float n1, float n2){
        return n1-n2; 
    }
    
    static float produto(float n1, float n2){
        return n1*n2; 
    }
    
    static float divisao(float n1, float n2){
        if(n2 != 0){
            return n1/n2;
        } else{
            return Float.NaN;
        }
         
    }
    
    public static void main(String[] args) {
        
        // Declaração das variáveis
        int operacao = 0;
        float n1, n2;
        Scanner ler = new Scanner(System.in);
        
        while(operacao >= 1 || operacao <= 5){
            // Entrada de dados: escolha da operação
            System.out.println("Operação desejada:");
            System.out.println("[1] Soma");
            System.out.println("[2] Subtração");
            System.out.println("[3] Produto");
            System.out.println("[4] Divisão");
            System.out.println("[5] Sair");
            operacao = ler.nextInt();
            
            // Validação para sair do menu
            if(operacao == 5){
                System.out.println("Obrigada!");
                break;
            }
            
            // Entrada de dados: escolha dos números
            System.out.println("Digite um número");
            n1 = ler.nextFloat();
            System.out.println("Digite um número");
            n2 = ler.nextFloat();
        
            switch(operacao){
                case 1: 
                    System.out.println("Soma: " + n1 + " + " + n2 + " = " + soma(n1,n2));
                    break;
                case 2: 
                    System.out.println("Subtração: " + n1 + " - " + n2 + " = " + subtracao(n1,n2));
                    break;
                case 3: 
                    System.out.println("Produto: " + n1 + " X " + n2 + " = " + produto(n1,n2));
                    break;
                case 4: 
                    System.out.println("Divisão: " + n1 + " / " + n2 + " = " + divisao(n1,n2));
                    break;
                case 5:
                    System.out.println("Obrigada!");
                    break;
                default:
                    System.out.println("Número incorreto, tente novamente");
            }
        }
    }
}
