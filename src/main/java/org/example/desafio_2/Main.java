package org.example.desafio_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fatorial fatorial = new Fatorial();

        System.out.println("Informe um número entre 0 e 12:");
        int numero = scanner.nextInt();

        if (!(numero<0 || numero>12)){
            System.out.println("O fatorial de "+numero+" é: "+fatorial.fatorialDoNumeroDigitado(numero));
        }
        else {
            System.out.println("Número inválido");
        }
    }
}