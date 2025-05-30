/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocarro;

/**
 *
 * @author pc
 */
public class Carro {
    
    // atributos
    String  nome;
    String  marca;
    int ano;
    int vel;
    
    //métodos
    void acelerar(int aceleracao){
        vel+=aceleracao;
    }
    
    void freiar(int reduzir){
        vel-=reduzir;
    }
    
    void buzinar(){
        System.out.println("Carro Buzinando");
    }
    void acenderfarol() {
    	System.out.println("Farol aceso");
    }
    void apagarfarol() {
    	System.out.println("Farol desligado");
    }
}
