package com.singletonshowcase.controller;

import com.singletonshowcase.model.Classe_Teste;
import com.singletonshowcase.service.Service_Teste;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/teste")
public class Controller_Teste {
    Service_Teste service = Service_Teste.getInstance();

    List<Classe_Teste> BaseDeDados = new ArrayList<>();
    @PostMapping()
    public Classe_Teste salvaNovo(@RequestBody Classe_Teste classe_teste){
         return   service.salvaNovo(BaseDeDados,classe_teste).stream()
                                   .filter(t -> t.getIdTeste() == classe_teste.getIdTeste())
                                           .collect(Collectors.toList()).get(0);

    }
    @GetMapping()
    public List<Classe_Teste> list(){
        return   service.listaTodos(BaseDeDados);
    }
}
