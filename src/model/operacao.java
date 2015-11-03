/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author romilson gomes
 *
 */

    
public class operacao {

    /**
     * . A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salário
     * e número de filhos. A prefeitura deseja saber:
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00. 

     */
    public static float  totalSalario =0;
    public static float contadorSalario =0;
    public static float totalFilho=0;
    public static float contadorFilho=0;
    public static float salarioMaior =0;
    public static float salarioMedia=0;
    public static float filhoMedia=0;
public float mediaSalario( float salario){
    contadorSalario++;
    totalSalario=salario;
    return salarioMedia = totalSalario/contadorSalario;
}   

public float mediaFilho(float filho){
    contadorFilho++;
    totalFilho = filho;
    return filhoMedia= totalFilho/contadorFilho;    
}
public float maiorSalario(float salario){
    if(salario>salarioMaior){
        salarioMaior = salario;
    }
    return salarioMaior;
}

}