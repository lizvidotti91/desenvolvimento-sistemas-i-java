/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentosmusicais;

/**
 *
 * @author Liz
 */
public class Violao extends InstrumentoMusical {
    public Violao(){
        super("Violão",TipoInstrumento.CORDA);      
    }

    @Override
    public String tocar(String cancao) {
        return "Dedilhando a canção " + cancao;
    }

    @Override
    public String afinar() {
        return "Afinando as cordas do violão!";
    }
}
