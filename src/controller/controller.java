/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.operacao;

/**
 *
 * @author romilson gomes
 */
public class controller {
    private operacao operador = new operacao();
    
    public  float solicitarMediaSalario(float salario){
        return operador.mediaSalario(salario);
    }
    
    public float solicitarMediaFilho(float filho){
        return operador.mediaFilho(filho);
    }
    
    public float solicitarMaiorSalario(float salario){
        return operador.maiorSalario(salario);
    }
}
