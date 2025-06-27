/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicao;

/**
 *
 * @author laura
 */
public class Direcao {

    private String cor; 
    private double tamanhoRaio;
    private boolean kitMultimidia;

    //getters
    
    public String getCores(){
    
    return cor;
    }

    public double getRaio(){
    return tamanhoRaio;
    }
    
    public boolean getKit(){
    return kitMultimidia;
    }
    
    //setters
    
    public void setCor(String cor){
    this.cor = cor;
    }
    
    public void setRaio(double tamanhoRaio){
    this.tamanhoRaio = tamanhoRaio;
    }
    
    public void setKit(boolean kitMultimidia){
    this.kitMultimidia = kitMultimidia;
    }
    
    //construtor
    
    public Direcao(String cor, double tamanhoRaio, boolean kitMultimidia){
    this.cor = cor;
    this.tamanhoRaio = tamanhoRaio;
    this.kitMultimidia = kitMultimidia;
        
    }
    
    //toString
    
    @Override
    public String toString(){
    return "\n cor: " + cor + "\n tamanho do raio " + tamanhoRaio + "\n kit multimidia" + kitMultimidia;
    }
    
    
}
