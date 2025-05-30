/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocarro;

/**
 *
 * @author CAMARGO
 */
public class Moto {
    
    String nomeM;
    String marcaM;
    int anoM;
    int velM;
    
    void acelerarM(int props){
        velM = velM + props;
        System.out.println("Sua moto foi para a velocidade: "+velM+"KM/h");
    }
    
    void freiarM(int para){
        velM = velM - para;
        System.out.println("Sua moto diminuiu a velocidade para: "+velM+"KM/h");
    }
    
    void buzinarM(){
        System.out.println("Moto buzinando!");
    }
    
    void Grau(){
        System.out.println("Dando um grau!");
    }
    
    void FarolA(){
    	System.out.prinln("Farol aceso!");
    }
    
    void FarolD(){
    	System.out.println("Farol desligado!");
    }
    
    }

