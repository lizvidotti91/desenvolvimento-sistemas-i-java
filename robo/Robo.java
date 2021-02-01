package robo;

/**
 *
 * @author Liz
 */
public class Robo {
    public static void main(String[] args) {
        RoboMedico docRobot = new RoboMedico();
        RoboArqueologo indianaRobot = new RoboArqueologo();
        
        System.out.println(".: Robô Médico :.");
        System.out.println(docRobot.iniciar());
        System.out.println(docRobot.cortar("tórax"));
        System.out.println(docRobot.recarregar());
        System.out.println(docRobot.costurar("apêndice"));
        System.out.println(docRobot.desligar());
        
        System.out.println("\n.: Robô Arqueólogo :.");
        System.out.println(indianaRobot.iniciar());
        System.out.println(indianaRobot.cavar("Pirâmides do Egito"));
        System.out.println(indianaRobot.recarregar());
        System.out.println(indianaRobot.cavar("Tumba de Ramsés"));
        System.out.println(indianaRobot.desligar());
    }   
}
