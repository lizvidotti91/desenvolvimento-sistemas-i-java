package adocaomain;

import java.util.ArrayList;
import java.util.Scanner;

public class AdocaoMain {
    public static void main(String[] args) {
        
        // Instanciando os objetos Pet
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        Pet pet3 = new Pet();
        Pet pet4 = new Pet();
        
        // Passando os parâmetros no construtor para cada Pet
        pet1.Pet("Snoopy", 0, 2, 5.6, 'M');
        pet2.Pet("Lassie", 1, 1, 1.5, 'F');
        pet3.Pet("Priscila", 2, 5, 6.7, 'F');
        pet4.Pet("Rex", 3, 2, 2.3, 'M');
        
        // Pets para adoção
        ArrayList<Pet> petsParaAdocao =  new ArrayList<>();
        petsParaAdocao.add(pet1);
        petsParaAdocao.add(pet2);
        petsParaAdocao.add(pet3);
        petsParaAdocao.add(pet4);
        
        // Instanciando objeto Responsavel
        Responsavel pessoa = new Responsavel();
                
        // Passando os parâmetros no construtor para o Responsavel
        pessoa.Responsavel("999.999.999-99", "Chiquinha", 18);
        
        // Criando variável de leitura
        Scanner ler = new Scanner(System.in);
        
        // Iniciando variável do menu
        int op = 1;
        
        // Menu para adoção de Pet
        while(op != 4){
            System.out.println("O que você deseja fazer?");
            System.out.println("[1]Adotar Pet \n[2]Listar Pets Adotados \n[3]Listar Pets Restantes \n[4]Sair");
            op = ler.nextInt();
            
            switch(op){
                case 1:
                    AdocaoMain.realizarAdocao(pessoa, petsParaAdocao, ler);
                    break;
                case 2:
                    AdocaoMain.listarPetsAdotados(pessoa);
                    break;
                case 3:
                    AdocaoMain.listarPetsRestantes(petsParaAdocao);
                    break;
                case 4:
                    System.out.println("Obrigada por sua participação!");
                    break;
                default:
                    System.out.println("Operação inválida. Por favor, tente novamente.");
            }
        }
    }
    
    private static void realizarAdocao(Responsavel r, ArrayList<Pet> petsParaAdocao, Scanner sc){
        System.out.println("Informe qual Pet você deseja adotar ou pressione 0 para voltar: ");
        for(int i = 1; i <= petsParaAdocao.size(); i++){
            System.out.println(i + " - " + petsParaAdocao.get(i-1).getInfoPet());
        }
        int numeroPet = sc.nextInt();
        if(numeroPet == 0){
            return;
        }
        Pet candidato = petsParaAdocao.get(numeroPet - 1);
        if(r.adotarPet(candidato)){
            petsParaAdocao.remove(candidato);
            System.out.println("Pet " + numeroPet + " adotado com sucesso por:\n" + r.getInforesponsavel());
        }
    }
    
    private static void listarPetsAdotados(Responsavel r){
        System.out.println("\nPets adotados até o momento: ");
        System.out.println(r.listarPets());
    }
    
    private static void listarPetsRestantes(ArrayList<Pet> petsParaAdocao){
        System.out.println("\nPets restantes para adoção: ");
        for(Pet p : petsParaAdocao){
            System.out.println(p.getInfoPet());
        }
    }
    
}
