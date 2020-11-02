/*
    O estudante Chapolin obteve as seguintes notas nas atividades de DS1: 6.6, 9.0 e 7.2.
    Utilize um vetor para armazenar as notas obtidas.
    Percorra o vetor e exiba uma mensagem com a média aritmética em seguida.
    Considere as condições abaixo e informe qual foi o conceito final de Chapolin na disciplina:
    Média 9.0 ou superior: Conceito A;
    Média entre 8.0 e 8.9: Conceito B;
    Média entre 7.0 e 7.9: Conceito C;
    Média entre 6.0 e 6.9: Conceito D;
    Média abaixo de 6.0: Conceito F.
*/

package revisaodelogica1;
public class RevisaoDeLogica1 {
    public static void main(String[] args) {
        float notas[] = {6.6f,9f,7.2f};
        float media = 0;
        
        for(int i = 0;i < notas.length; i+=1){
            media = media + notas[i];
        }
        media = media / notas.length;
        
        System.out.println("Média " + media);
        if(media >= 9){
            System.out.println("Conceito A");
        } else if(media >= 8){
            System.out.println("Conceito B");
        } else if(media >= 7){
            System.out.println("Conceito C");
        } else if(media >= 6){
            System.out.println("Conceito D");
        } else{
            System.out.println("Conceito F");
        }
    } 
}
