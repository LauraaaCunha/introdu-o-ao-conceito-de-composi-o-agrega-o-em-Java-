/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicao;

/**
 *
 * @author laura
 */
public class Automovel {
    private Motor motor;
    private Direcao direcao;
    
    //get
    
    public Motor getMotor(){
    return motor;
    }
    
    public Direcao getDirecao(){
    return direcao;
    }
    
    //set
    
    public void setMotor(Motor motor){
        this.motor = motor;
            
    }
    
    public void setDirecao(Direcao direcao){
    this.direcao = direcao;
    }
    
    //construtor
    
    public Automovel(Motor motor, Direcao direcao){
    this.motor = motor;
    this.direcao = direcao;
    
    }
    
    //toString
    
    @Override
    public String toString(){
    return "\n motor: " + motor + "\n direção: " + direcao;
    }
    
        
    
}
