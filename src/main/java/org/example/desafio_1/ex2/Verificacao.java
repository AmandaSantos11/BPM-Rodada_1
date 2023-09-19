package org.example.desafio_1.ex2;
public class Verificacao {
    public String verificaSeNumeroEPositivo(int numero){
        if (numero>0){
            return "O número digitado é positivo";
        }
        else if(numero==0){
            return "Zero é um número neutro";
        }
        return "O número digitado é negativo";
    }
}