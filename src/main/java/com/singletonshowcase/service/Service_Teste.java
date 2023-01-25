package com.singletonshowcase.service;

import com.singletonshowcase.model.Classe_Teste;

import java.util.List;
import java.util.stream.Collectors;


public class Service_Teste {

    private static Service_Teste instancia;

    public static Service_Teste getInstance(){
        if(instancia==null){
            instancia = new Service_Teste();
        }
        return instancia;
    }


    public List<Classe_Teste> salvaNovo(List<Classe_Teste> armazenamento,Classe_Teste classe_teste) {
        armazenamento.add(classe_teste);
        return armazenamento;
    }

    public List<Classe_Teste> listaTodos(List<Classe_Teste> armazenamento) {
        return armazenamento;
    }
}
