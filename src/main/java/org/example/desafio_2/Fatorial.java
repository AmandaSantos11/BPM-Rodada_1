package org.example.desafio_2;
public class Fatorial {
    public int fatorialDoNumeroDigitado(int numero){
        int resultado = 1;

        for (int i=1; i<= numero; i++){
            resultado *=i;
        }

        return resultado;
    }
}