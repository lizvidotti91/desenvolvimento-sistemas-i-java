package leituraarquivonomeidade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Liz
 */
public class LeituraArquivoNomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        
        File cadastro = new File("cadastro.txt");
            try {
                cadastro.createNewFile();
                System.out.println("Arquivo criado com sucesso!");
            } catch (IOException ex) {
                System.out.println("Arquivo já existe!");
            }
        
        while(opcao != 3){
            System.out.println(".: O QUE DESEJA FAZER? :.");
            System.out.println("[1] Cadastrar Dados \n[2] Obter Dados \n[3] Sair");
            opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Nome:");
                    String nome = sc.next();
                    
                    System.out.println("Idade:");
                    int idade = sc.nextInt();
                    
                    System.out.println("Altura:");
                    float altura = sc.nextFloat();
                    
                    {
                        try {
                        FileWriter escrita = new FileWriter(cadastro.getName(),true);
                        String linha = nome + "; " + idade + "; " + altura + ";\n";
                        escrita.write(linha);
                        escrita.close();
                    } catch (IOException ex) {
                            System.out.println("Falha ao gravar os dados");
                        }
                    }
                break;
                case 2:
                    try {
                        Scanner leitura = new Scanner(cadastro);
                        while(leitura.hasNextLine()){
                           String array[] = new String[3];
                           array = leitura.nextLine().split(";");
                           System.out.println("Nome: " + array[0] + "; Idade: " + array[1] + " anos; Altura: " + array[2] + " m");
                        }
                    } catch (FileNotFoundException ex) {
                        System.out.println("Falha ao carregar o arquivo");
                    }
                break;
                case 3:
                    System.out.println("Programa encerrado");
                break;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida.");
            }
        }
    }
}
