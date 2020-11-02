package appbank;

public class AppBank {

    public static void main(String[] args) {
        BankAccount cb1 = new BankAccount();
        BankAccount cb2 = new BankAccount();
        
        cb1.BankAccount("Elis", 12367, 'P');
        cb2.BankAccount("Pedro", 12345, 'P');
        
        Agencia newAgencia = new Agencia();
        
        newAgencia.Agencia(123,"Salvador", "Banco da Hora");
        newAgencia.adicionarConta(cb1);
        newAgencia.adicionarConta(cb2);
        
        System.out.println(newAgencia.listarContas());
    }
    
}
