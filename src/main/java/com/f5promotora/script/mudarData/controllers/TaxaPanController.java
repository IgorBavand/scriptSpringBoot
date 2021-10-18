package com.f5promotora.script.mudarData.controllers;


import com.f5promotora.script.mudarData.services.TaxaPanService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxa-pan")
public class TaxaPanController {

    @Autowired
    private TaxaPanService service;

    @GetMapping("ler-arquivo")
    public void lerTaxaPan(){
        service.ler();
    }



}
