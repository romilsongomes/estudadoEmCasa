/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.controller;
import java.util.Scanner;
import static model.operacao.filhoMedia;
import static model.operacao.salarioMaior;
import static model.operacao.salarioMedia;

/**
 *
 * @author romilson gomes
 */


public class menuPrincipal {
    private controller c = new controller();
    public menuPrincipal(){
        mesagemBoaVindas();
         realizarOp();
    }
    public static void main(String[] args){
      new  menuPrincipal();
    }
    public void mesagemBoaVindas(){
        System.out.println("Bem Vindo Ao Program Que Cadatra Salario e Filhos!");
    }
    
    public void realizarOp(){
        Scanner s = new Scanner(System.in);
        int n=0;
        do{
            
        System.out.println("Digite:\n1-Cadatrar dados\n2-Ver dados\n");
        int num = s.nextInt();
        if (num==1){
            System.out.println("Informe o salario: ");
            float salario =s.nextFloat();
            System.out.println("Inforem o numero de filhos: ");
            float filho = s.nextFloat();
            c.solicitarMaiorSalario(salario);
            c.solicitarMediaFilho(filho);
            c.solicitarMediaSalario(salario);
            System.out.println("Voce quer retornar ao meu!\n1-Sim\n2-Nao");
             n=s.nextInt();
                        
        }  else if(num==2){
                  System.out.println("3-Para ver media de salario\n4-Para ver media de filho\n5-Para ver maior salario:\n");
                   float num1=s.nextFloat();
                    if(num1==3){
                     System.out.println("A media dos salarios é:"+salarioMedia);
                    }else if(num1==4){
                        System.out.println("A media de filhos é:"+ filhoMedia);
                    }else if(num1==5){
                        System.out.println("O maior salario é " +salarioMaior);
                    }else{
                        System.out.println("Valor Invalido!");
                    }
        }
    }while(n==1);
        
    }
}