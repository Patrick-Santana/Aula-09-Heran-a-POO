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
public class Taxi  extends Carro{
    private String placa;
    
    
    public Taxi(String modelo, int ano, String placa){
        super(modelo, ano);
        this.setPlaca(placa);
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public static void main(String[] args){
        Taxi d = new Taxi("Santana",1998,"kje-3092");
        d.setModelo("Brasilia");
        d.setAno(1976);
        d.setPlaca("pea-3322");
        
       
    }
    
}
