package adocaomain;

/**
 *
 * @author Liz
 */
public class Pet {
    private String nome;
    private String raca;
    private int idade;
    private double peso;
    private char sexo;
    
    public static final String[] racas = {"Vira-Lata","Labrador","Pastor Alemão","São Bernardo"};
    // 0 - Vira Lata 1 - Labrador, 2 - Pastor Alemão, 3 - São Bernardo
    
    // Construtor
    public void Pet(String nome, int raca, int idade, double peso, char sexo){
        this.nome = nome;
        this.raca = Pet.racas[raca];
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
    }
    
    // Getter
    public String getInfoPet(){
        return "=== PET ===" +
                "\nNome: " + this.nome +
                "\nRaça: " + this.raca +
                "\nIdade: " + this.idade +
                " Peso: " + this.peso +
                " Sexo: " + this.sexo;
    }
}
