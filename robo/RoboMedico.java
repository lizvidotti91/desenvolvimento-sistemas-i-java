/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;

/**
 *
 * @author Liz
 */
public class RoboMedico implements RoboPai {

    @Override
    public String iniciar() {
        return "Iniciando os sensores médicos de toque e visão raio-X!";
    }

    @Override
    public String desligar() {
        return "Desligando até a próxima cirurgia!";
    }

    @Override
    public String recarregar() {
        return "Dando uma pausa para recarregar as energias!";
    }
    
    public String cortar(String orgao){
        return "Cortando a(o) " + orgao + " do paciente.";
    }
    
    public String costurar(String orgao){
        return "Costurando a(o) " + orgao + " do paciente.";
    }
    
}
