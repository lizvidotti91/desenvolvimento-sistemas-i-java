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
public class FlautaDoce extends InstrumentoMusical {
    public FlautaDoce(){
        super("Flauta Doce",TipoInstrumento.SOPRO);
    }

    @Override
    public String tocar(String cancao) {
        return "Assoprando a canção " + cancao;
    }

    @Override
    public String afinar() {
        return "Reencaixando a flauta para afinação!";
    }   
}
