/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JENG-PC
 */
public class Modelo {
    private float Pesos,Dolares,resultado;
    private final float VLR_DOLAR = (float) 3777.36;//Constante

    public float getPesos() {
        return Pesos;
    }

    public float getDolares() {
        return Dolares;
    }

    public void setPesos(float Pesos) {
        this.Pesos = Pesos;
    }

    public void setDolares(float Dolares) {
        this.Dolares = Dolares;
    }

    public float getVLR_DOLAR() {
        return VLR_DOLAR;
    }
    
    

    public float getResultado() {
        return resultado;
    }
    
    public float conversion(){
        resultado = Pesos/VLR_DOLAR;        
        return resultado;
    }
    
    
    
    
    
    
    
}
