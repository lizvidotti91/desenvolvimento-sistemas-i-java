package appbank;

import java.util.ArrayList;

public class Agencia {
    private Integer numeroAgencia;
    private String cidade;
    private String nomeBanco;
    private ArrayList<BankAccount> listaContas;
    
    public void Agencia(Integer numeroAgencia, String cidade, String nomeBanco){
        this.numeroAgencia = numeroAgencia;
        this.cidade = cidade;
        this.nomeBanco = nomeBanco;
        this.listaContas = new ArrayList<>();
    }
    
    public Integer getNumero(){
        return this.numeroAgencia;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public void adicionarConta(BankAccount newAccount){
        this.listaContas.add(newAccount);
    }
    
    public String listarContas(){
        String dadosContas = "Agência N.: " + this.numeroAgencia +
                "\nCidade: " + this.cidade +
                "\nBanco: " + this.nomeBanco +
                "\n";
        for(BankAccount item : listaContas){
            dadosContas += item.getExtrato();
        }
        return dadosContas;
    }
    
}
