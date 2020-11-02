package adocaomain;

import java.util.ArrayList;

/**
 *
 * @author Liz
 */
public class Responsavel {
    private String cpf;
    private String nome;
    private int idade;
    private ArrayList<Pet> petsAdotados;
    
    // Construtor
    public void Responsavel(String cpf, String nome, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.petsAdotados = new ArrayList<>();
    }
    
    // Métodos
    public boolean adotarPet(Pet pet){
        if(this.idade >= 18){
            this.petsAdotados.add(pet);
            return true;
        } else{
            return false;
        }
    }
    
    public String listarPets(){
        String listaPets = "=== PETS ADOTADOS ===\n";
        for(Pet items : petsAdotados){
            listaPets += items.getInfoPet();
        }
        return listaPets;
    }
    
    // Getters
    public String getInforesponsavel(){
        return "=== Responsável ===" +
                "\nNome: " + this.nome +
                " Idade: " + this.idade + 
                " CPF: " + this.cpf;
    }
}
