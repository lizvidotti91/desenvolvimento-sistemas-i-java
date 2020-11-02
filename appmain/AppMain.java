package appmain;

import java.util.Scanner;
import appmain.ContaBanco;

public class AppMain {

    public static void main(String[] args) {
        
        // Declaração das variáveis
        float valor;
        int op = 1;
        Scanner ler = new Scanner(System.in);
        
        // Entrada de Dados
        System.out.println("========== Cadastro de nova conta ==========");
        
        System.out.println("Banco: ");
        String banco = ler.next();
        
        System.out.println("Número da Agência: ");
        String agencia = ler.next();
        
        System.out.println("Número da Conta: ");
        String conta = ler.next();
        
        System.out.println("Nome do Titular: ");
        String titular = ler.next();
        
        // Instanciando um objeto a partir da classe ContaBanco
        ContaBanco novaConta = new ContaBanco( banco, agencia, conta, titular);
        
        char tipo = 'A';
        while(tipo != 'C' && tipo != 'P'){
            System.out.println("Tipo de Conta: \n[C] Corrente\n[P] Poupança");
            tipo = ler.next().charAt(0);
            novaConta.setTipoConta(tipo);
        }
        
        // Mostrando os dados da conta
        System.out.println("Conta cadastrada com sucesso! Seja bem-vinda(o)");
        System.out.println(novaConta.imprimir());
        
        // Operações com a conta
        while(op != 4){
            // Entrada dos Dados (Métodos)
            System.out.println("Digite o tipo de operação desejada");
            System.out.println("[1] Saque \n[2] Depósito \n[3] Imprimir dados \n[4] Sair");
            op = ler.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Digite o valor de saque: R$ ");
                    valor = ler.nextFloat();
                    novaConta.sacar(valor);
                    break;
                case 2:
                    System.out.println("Digite o valor de depósito: R$ ");
                    valor = ler.nextFloat();
                    novaConta.depositar(valor);
                    break;
                case 3:
                    System.out.println(novaConta.imprimir());
                    break;
                case 4:
                    System.out.println("Obrigada!");
                    break;
                default:
                    System.out.println("Digite uma operação válida.");
            }
        }
    } 
}
