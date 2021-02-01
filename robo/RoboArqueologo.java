package robo;

/**
 *
 * @author Liz
 */
public class RoboArqueologo implements RoboPai {

    @Override
    public String iniciar() {
        return "Iniciando os sensores arqueológicos de luz e detecção do material!";
    }

    @Override
    public String desligar() {
        return "Desligando até a próxima expedição arqueológica!";
    }

    @Override
    public String recarregar() {
        return "Recarregando as energias para a próxima escavação arqueológica!";
    }
    
    public String cavar(String local){
        return "Cavando em " + local;
    }
    
}
