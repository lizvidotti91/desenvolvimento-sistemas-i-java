package peneiradeerastotenes;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Liz
 */
public class PeneiraDeErastotenes {
    
    // O Crivo de Eratóstenes é um algoritmo e um método simples e prático para encontrar números primos até um certo valor limite. Segundo a tradição, foi criado pelo matemático grego Eratóstenes, o terceiro bibliotecário-chefe da Biblioteca de Alexandria. 
    // Fazer um algoritmo que determine os números primos de determinada sequência

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        // Entrada de dados
        System.out.println("Vamos descobrir os números primos de uma dada sequência! Digite o primeiro número [inteiro] da lista:");
        int first = ler.nextInt();
        System.out.println("Agora digite o último número da sequência:");
        int last = ler.nextInt();
        
        // Criando a lista de números
        LinkedList<Integer> numeros = new LinkedList<Integer>();
        for(int i = first; i <= last;i++){
            numeros.add(i);
        }
        
        // Criando a lista de números primos
        LinkedList<Integer> primos = new LinkedList<Integer>();
        
        for(Integer item : numeros ){
            if(item == 2 || item == 3 || item == 5 || item == 7){
                primos.add(item);
            } else if(item == 0 || item == 1 || item % 2 == 0 || item % 3 == 0 || item % 5 == 0 || item % 7 == 0){
                //nada acontece
                continue;
            } else{
               primos.add(item);
            }
        }
        
        // Saída de Dados
        String res = "Os números primos entre " + first + " e " + last + " são: ";
        for(Integer item : primos){
            res += item + "; ";
        }        
        System.out.println(res);
    }
    
}
