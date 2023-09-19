package org.example.desafio_1.ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Verificacao verificacao = new Verificacao();

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        System.out.println(verificacao.verificaSeNumeroEPositivo(numero));
    }
}