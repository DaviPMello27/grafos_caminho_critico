package com.univali.caminho_critico;

import com.univali.caminho_critico.grafo.Grafo;
import com.univali.caminho_critico.grafo.Vertice;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Grafo grafo = new Grafo();



        grafo.adicionaVertice(new Vertice("A", 2));
        grafo.adicionaVertice(new Vertice("B", 3, Vertice.listaIds("A")));
        grafo.adicionaVertice(new Vertice("C", 5, Vertice.listaIds("A")));
        grafo.adicionaVertice(new Vertice("D", 2, Vertice.listaIds("C")));
        grafo.adicionaVertice(new Vertice("E", 11, Vertice.listaIds("D")));

        System.out.println("");
    }
}
