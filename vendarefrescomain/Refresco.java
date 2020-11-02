package vendarefrescomain;

import java.util.ArrayList;

/**
 *
 * @author Liz
 */
public class Refresco {
    double precoUnitario;
    private String sabor;
    private char tamanho;
    private boolean contemAcucar;
    private Fabricante fabricante;
    
    public static final String[] sabores = {"Tamarindo","Limão","Groselha"};
   
    public void Refresco(int sabor, char tamanho, boolean contemAcucar, Fabricante fabricante){
        this.sabor = Refresco.sabores[sabor];
        this.tamanho = tamanho;
        this.contemAcucar = contemAcucar;
        this.fabricante = fabricante;
        this.precoUnitario = 2.5f;
    }
    
    //GETTERS
    public double getPrecoUnitario(){
        return this.precoUnitario;
    }
    
    public String getInfoRefresco(){
        return "\n========== REFRESCO ==========" +
                "\nSabor: " + this.sabor +
                "\nContém açúcar: " + this.contemAcucar +
                "\nPreço Unitário: Cr$ " + this.precoUnitario +
                "\n" + fabricante.getInfoFabricante();
    }
    
    // SETTERS
    public void setPrecoUnitario(){
        if(this.tamanho == 'G'){
            this.precoUnitario += 1.0f;
        } else if(this.tamanho == 'M'){
            this.precoUnitario += 0.50f;
        }
        
        if(this.contemAcucar == true){ // mais usual encontrar if(this.contemAcucar){};
            this.precoUnitario += 0.50f;
        }
    }
}
