package org.example.desafio_1.ex3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Verificacao verificacao = new Verificacao();

        System.out.println("Digite uma letra:");
        char letra = scanner.next().charAt(0);

        if (verificacao.verificaSeLetraEVogal(letra)){
            System.out.println("É vogal");
        }
        else {
            System.out.println("É consoante");
        }
    }
}