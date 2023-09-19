package org.example.desafio_3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsumoMedio consumoMedio = new ConsumoMedio();

        System.out.println("Digite a distância percorrida em Km:");
        int distancia = scanner.nextInt();

        System.out.println("Digite o total de combustível consumido:");
        double combustivel = scanner.nextDouble();

        double consumo = consumoMedio.retornaConsumoMedio(distancia,combustivel);

        System.out.printf("Consumo médio: %.3f km/l",consumo);
    }
}