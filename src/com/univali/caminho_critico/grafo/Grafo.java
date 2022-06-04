package com.univali.caminho_critico.grafo;

import java.util.ArrayList;

public class Grafo {
    private ArrayList<Vertice> vertices;

    public Grafo(){
        this.vertices = new ArrayList<Vertice>();
    }

    public void adicionaVertice(Vertice vertice){
        for(Vertice verticeGrafo : this.vertices){
            if(vertice.getAnterioresIds().contains(verticeGrafo.getId())){
                verticeGrafo.addProximoId(vertice.getId());
                vertice.addAnteriorId(verticeGrafo.getId());
            } else if(vertice.getProximosIds().contains(verticeGrafo.getId())){
                verticeGrafo.addAnteriorId(vertice.getId());
                vertice.addProximoId(verticeGrafo.getId());
            }
        }
        this.vertices.add(vertice);
    }

    public ArrayList<Vertice> getVertices(){
        return this.vertices;
    }
}
