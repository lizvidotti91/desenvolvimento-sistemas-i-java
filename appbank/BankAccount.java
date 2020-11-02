
package appbank;

public class BankAccount {
    
    private String nomeTitular;
    private Integer numeroConta;
    private char tipoConta;
    private float limiteSaque;
    private float saldo;
    
    public void BankAccount(String nomeTitular, int numeroConta, char tipoConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = 0.0f;
        this.limiteSaque = 500.0f;
    }
    
    public String setTipoConta(char tipoConta){
        if(tipoConta == 'C' || tipoConta == 'P'){
            this.tipoConta = tipoConta;
            return "Tipo de Conta cadastrado com sucesso!";
        } else {
            return "Operação inválida.";
        }   
    }
    
    public String sacar(float valor){
        if(valor > this.saldo || valor > this.limiteSaque){
            return "Operação inválida. Valor superior ao saldo ou ao limite de saque diário";
        } else{
            this.saldo -= this.saldo - valor;
            return "Operação realizada com sucesso! Novo saldo: R$ " + this.saldo;
            // geralmente retorna um booleano, e o main coloca essas strings
        }
    }
    
    public String depositar(float valor){
        this.saldo += this.saldo + valor;
        return "Operação relizada com sucesso! Novo saldo: R$ " + this.saldo;
    }
    
    public String getExtrato(){
        return "========== DADOS DA CONTA =========="
                + "\nNome do Titular: " + this.nomeTitular
                + "\nNúmero da Conta: " + this.numeroConta
                + " | Tipo de conta: " + this.tipoConta
                + "\nSaldo: R$ " + this.saldo
                + "\nLimite diário: R$ " + this.limiteSaque + "\n";
    }
}
