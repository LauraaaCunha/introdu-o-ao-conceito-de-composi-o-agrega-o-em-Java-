/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicao;

/**
 *
 * @author laura
 */
public class Motor {
    private double potencia;
    private String combustivel;
    private String chassi;
    
    //getters
    
    public double getPotencia(){
    return potencia;
    }
    
    public String getCombustivel(){
    return combustivel;
    }
    
    public String getChassi(){
    return chassi;
    }
    
    //setters
    
    public void setPotencia(double potencia){
    this.potencia = potencia;
    } 
    
    public void setCombustivel(String combustivel){
    this.combustivel = combustivel;
    }
    
    public void setChassi(String chassi){
    this.chassi = chassi;
    }
    
    //construtores
    
    public Motor(double potencia, String combustivel, String chassi){
    this.potencia = potencia;
    this.combustivel = combustivel;
    this.chassi = chassi;
    }    
    
    //toString
    
    @Override
    public String toString(){
        
    return "\n potencia: " + potencia + "\n combustivel: " + combustivel + "\n chassi: " + chassi;
    }
    }

