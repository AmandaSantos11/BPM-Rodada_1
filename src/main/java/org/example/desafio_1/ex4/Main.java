package org.example.desafio_1.ex4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nota nota = new Nota();

        System.out.println("Digite a nota do aluno:");
        int notaDigitada = scanner.nextInt();

        if (notaDigitada<0 || notaDigitada>10){
            System.out.println("Nota inválida");
        }
        else {
            System.out.println(nota.statusDaNota(notaDigitada));
        }
    }
}