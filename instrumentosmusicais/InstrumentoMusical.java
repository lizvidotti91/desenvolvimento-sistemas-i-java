package instrumentosmusicais;

/**
 *
 * @author Liz
 */
public abstract class InstrumentoMusical {
    enum TipoInstrumento{
        SOPRO,
        CORDA,
        PERCUSSAO
    }
    
    private String nome;
    private TipoInstrumento tipo;
    
    public InstrumentoMusical(String nome, TipoInstrumento tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public TipoInstrumento getTipo() {
        return tipo;
    }
    
    public abstract String tocar(String cancao);
    public abstract String afinar();
}
