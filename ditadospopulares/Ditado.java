/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ditadospopulares;

/**
 *
 * @author Liz
 */
public class Ditado {
    private String autor;
    private String ditado;

    Ditado(String autor, String ditado) {
        this.autor = autor;
        this.ditado = ditado;
    }
    
    public String getDitado(){
        return this.ditado + " | Autor: " + this.autor;
    }
}
