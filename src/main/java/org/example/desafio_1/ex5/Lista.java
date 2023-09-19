package org.example.desafio_1.ex5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Lista {
    public List<Integer> listaDeNumeros= new ArrayList<>();
    public void adicionaNumerosNaLista(){
        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(4);
        listaDeNumeros.add(5);
    }
    public void ordenaAListaDeNumerosEmOrdemDecrescente(){
        Collections.sort(listaDeNumeros, Collections.reverseOrder());
        System.out.println(listaDeNumeros);
    }
}