package appmain;

public class ContaBanco {
    private String nomeDoBanco;
    private String numDaAgencia;
    private String numDaConta; 
    private String nomeTitular;
    private char tipoConta; // P - poupança | C - corrente
    private float saldo;
    private float limiteSaque;
    
    // Construtor
    public ContaBanco(String nomeDoBanco, String numDaAgencia, String numDaConta, String nomeTitular){
        this.nomeDoBanco = nomeDoBanco;
        this.numDaAgencia = numDaAgencia;
        this.numDaConta = numDaConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0f;
        this.limiteSaque = 500.0f;
    }
    
    public void setTipoConta(char tipoConta){
        if(tipoConta == 'C' || tipoConta == 'P'){
            this.tipoConta = tipoConta;
        } else{
            // usar return
            System.out.println("Tipo de Conta inválido. Tente novamente.");
        }
    }
    
    public void sacar(float valor){
        // 1 - Sacar até o valor do saldo | 2 - Sacar até o valor do limite
        if(valor <= saldo && valor <= limiteSaque){
            saldo -= valor;
            // usar return
            System.out.println("Operação realizada com sucesso!\nNovo saldo: R$ " + this.saldo);
        } else {
            // usar return
            System.out.println("Não é possível realizar esta transação. Tente outro valor");
        }           
    }
    
    public void depositar(float valor){
        // atentar se o usuário tenta digitar um valor igual ou menor que zero
        if(valor > 0){
            saldo += valor;
            System.out.println("Operação realizada com sucesso!\nNovo Saldo: R$ " + this.saldo);
        } else {
            System.out.println("Não é possível realizar esta transação. Tente outro valor");
        }
    }
    
    public String imprimir(){
        // melhor return "string com todos os valores"
        return "==========Dados da Conta ==========" +
               "\nBanco: " + this.nomeDoBanco +
               "\nAgência: " + this.numDaAgencia +
               " | Conta: " + this.numDaConta + 
               "\nTitular: " + this.nomeTitular +
               "\nTipo de Conta: " + this.tipoConta +
               "\nSaldo: " + this.saldo +
               "\nLimite de Saque diário: " + this.limiteSaque;
    }  
}
