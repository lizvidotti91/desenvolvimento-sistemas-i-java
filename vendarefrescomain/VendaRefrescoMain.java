package vendarefrescomain;

import java.util.Scanner;

/**
 *
 * @author Liz
 */
public class VendaRefrescoMain {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        // CADASTRO DE NOVO FABRICANTE
        Fabricante fb1 = new Fabricante();
        
        // ENTRADA DE DADOS
        System.out.println("===== CADASTRO DE NOVO FABRICANTE =====");
        System.out.println("Digite nome do Fabricante:");
        String fabricante = ler.nextLine();
        
        System.out.println("Digite nome do CEO da empresa:");
        String ceo = ler.nextLine();
        
        System.out.println("Digite o ano de fundação da empresa:");
        int ano = ler.nextInt();
        
        // INICIANDO O CONSTRUTOR
        fb1.Fabricante(fabricante, ceo, ano);
        
        // CRIANDO OS REFRESCOS
        Refresco ref1 = new Refresco();        
        Refresco ref2 = new Refresco();        
        Refresco ref3 = new Refresco();
        
        // REFRESCO 1 - ENTRADA DE DADOS
        System.out.println("=== NOVO REFRESCO ===");
        int sabor = -1;
        while(sabor < 0 || sabor > 2){
            System.out.println("Sabores de refresco \n[0] Tamarindo \n[1]Limão \n[2]Groselha");
            sabor = ler.nextInt();
        }
        
        char tamanho = 'A';
        while(tamanho != 'G' && tamanho != 'M'){
            System.out.println("Tamanho do Refresco \n[G] \n[M]");
            tamanho = ler.next().charAt(0);
        }
        
        int op = -1;
        boolean acucar = false;
        while(op != 0 && op != 1){
            System.out.println("Você deseja açúcar? \n[0]SIM \n[1]NÃO");
            op = ler.nextInt();
            if(op == 0){
                acucar = true;
            } else{
                acucar = false;
            }
        }
        
        // REFRESCO 1 - INICIALIZANDO CONSTRUTOR
        ref1.Refresco(sabor, tamanho, acucar, fb1);
        ref1.setPrecoUnitario();
        
        // REFRESCO 2 - ENTRADA DE DADOS
        System.out.println("=== NOVO REFRESCO ===");
        sabor = -1;
        while(sabor < 0 || sabor > 2){
            System.out.println("Sabores de refresco \n[0] Tamarindo \n[1]Limão \n[2]Groselha");
            sabor = ler.nextInt();
        }
        
        tamanho = 'A';
        while(tamanho != 'G' && tamanho != 'M'){
            System.out.println("Tamanho do Refresco \n[G] \n[M]");
            tamanho = ler.next().charAt(0);
        }
        
        op = -1;
        acucar = false;
        while(op != 0 && op != 1){
            System.out.println("Você deseja açúcar? \n[0]SIM \n[1]NÃO");
            op = ler.nextInt();
            if(op == 0){
                acucar = true;
            } else{
                acucar = false;
            }
        }
        
        // REFRESCO 2 - INICIALIZANDO CONSTRUTOR
        ref2.Refresco(sabor, tamanho, acucar, fb1);
        ref2.setPrecoUnitario();
        
        // REFRESCO 3 - ENTRADA DE DADOS
        System.out.println("=== NOVO REFRESCO ===");
        sabor = -1;
        while(sabor < 0 || sabor > 2){
            System.out.println("Sabores de refresco \n[0] Tamarindo \n[1]Limão \n[2]Groselha");
            sabor = ler.nextInt();
        }
        
        tamanho = 'A';
        while(tamanho != 'G' && tamanho != 'M'){
            System.out.println("Tamanho do Refresco \n[G] \n[M]");
            tamanho = ler.next().charAt(0);
        }
        
        op = -1;
        acucar = false;
        while(op != 0 && op != 1){
            System.out.println("Você deseja açúcar? \n[0]SIM \n[1]NÃO");
            op = ler.nextInt();
            if(op == 0){
                acucar = true;
            } else{
                acucar = false;
            }
        }
        
        ref3.Refresco(sabor, tamanho, acucar, fb1);
        ref3.setPrecoUnitario();
        
        Venda nova = new Venda();
        
        nova.adicionarItem(ref1);
        nova.adicionarItem(ref2);
        nova.adicionarItem(ref3);
        
        System.out.println(nova.getItens());
    }
    
}
