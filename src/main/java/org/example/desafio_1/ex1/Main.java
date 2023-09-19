package org.example.desafio_1.ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Verificacao verificacao = new Verificacao();

        System.out.println("Digite um número:");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite outro número:");
        int numeroDois = scanner.nextInt();

        int numero = verificacao.verificaMaiorNumero(numeroUm,numeroDois);
        System.out.println("O maior número digitado é: "+numero);
    }
}