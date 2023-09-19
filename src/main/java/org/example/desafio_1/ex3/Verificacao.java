package org.example.desafio_1.ex3;
public class Verificacao {
    public boolean verificaSeLetraEVogal(char letra){
        letra = Character.toLowerCase(letra);
        return letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u';
    }
}