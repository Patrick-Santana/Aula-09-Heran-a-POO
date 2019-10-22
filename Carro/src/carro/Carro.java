/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class Carro {
    
    private String modelo;
    private int ano;
    
    
    public Carro(String modelo, int ano){
        this.setModelo(modelo);
        this.setAno(ano);
        
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

}
