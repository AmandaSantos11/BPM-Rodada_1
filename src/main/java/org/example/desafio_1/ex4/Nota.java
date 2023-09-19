package org.example.desafio_1.ex4;
public class Nota {
    public String statusDaNota(int nota){
        if (nota>=8){
            return "Aprovado";
        }
        else if(nota>=6 && nota<8){
            return "Em recuperação";
        }
        else {
            return "Reprovado";
        }
    }
}