package org.example.desafio_1.ex5;
public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adicionaNumerosNaLista();

        System.out.println("Lista original:");
        System.out.println(lista.listaDeNumeros);
        System.out.println();
        System.out.println("Lista ordenada:");
        lista.ordenaAListaDeNumerosEmOrdemDecrescente();
    }
}