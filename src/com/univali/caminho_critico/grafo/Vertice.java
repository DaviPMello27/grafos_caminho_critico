package com.univali.caminho_critico.grafo;

import java.util.ArrayList;
import java.util.Arrays;

public class Vertice {
    public static ArrayList<String> listaIds(String ...itens){
        return new ArrayList<String>(Arrays.asList(itens));
    }

    private final String id;
    private final Integer custo;
    private ArrayList<String> proximosIds;
    private ArrayList<String> anterioresId;

    public Vertice(String id, Integer custo, ArrayList<String> proximosIds, ArrayList<String> anterioresId){
        this.id = id;
        this.custo = custo;
        this.proximosIds = proximosIds;
        this.anterioresId = anterioresId;
    }

    public Vertice(String id, Integer custo, ArrayList<String> anterioresId){
        this.id = id;
        this.custo = custo;
        this.proximosIds = new ArrayList<String>();
        this.anterioresId = anterioresId;
    }

    public Vertice(String id, Integer custo){
        this.id = id;
        this.custo = custo;
        this.proximosIds = new ArrayList<String>();
        this.anterioresId = new ArrayList<String>();
    }

    public String getId(){
        return this.id;
    }

    public Integer getCusto(){
        return this.custo;
    }

    //Proximos
    public ArrayList<String> getProximosIds(){
        return this.proximosIds;
    }

    public void setProximosIds(ArrayList<String> proximosIds){
        this.proximosIds = proximosIds;
    }

    public void getProximoIdAt(Integer pos){
        this.proximosIds.get(pos);
    }

    public void addProximoId(String id){
        if(!this.proximosIds.contains(id)) {
            this.proximosIds.add(id);
        }
    }

    //Anteriores
    public ArrayList<String> getAnterioresIds(){
        return this.anterioresId;
    }

    public void setAnterioresIds(ArrayList<String> anterioresId){
        this.anterioresId = anterioresId;
    }

    public void getAnteriorIdAt(Integer pos){
        this.anterioresId.get(pos);
    }

    public void addAnteriorId(String id){
        if(!this.anterioresId.contains(id)){
            this.anterioresId.add(id);
        }
    }
}
