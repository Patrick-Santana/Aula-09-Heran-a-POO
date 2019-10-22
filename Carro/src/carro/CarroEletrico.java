/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author alunoifpe
 */
public class CarroEletrico extends Carro{
    
    private int voltagem;
    
    public CarroEletrico(String modelo, int ano, int voltagem){
       super(modelo,ano);
       this.setVoltagem(voltagem);
        
    }
    
    public int voltagem(){
        return this.voltagem;
    }
    
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }
    
}
