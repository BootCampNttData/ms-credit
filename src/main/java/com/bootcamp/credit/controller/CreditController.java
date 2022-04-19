package com.bootcamp.credit.controller;

import com.bootcamp.credit.model.Credit;
import com.bootcamp.credit.service.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/credit")
@RequiredArgsConstructor
public class CreditController {
    public final CreditService service;
    @GetMapping
    public Flux<Credit> getAll(){
        return service.findAll();
    }

    @GetMapping("/find/{clientId}")
    public Flux<Credit> findByClientId(@PathVariable("clientId") String clientId){
        return service.findByClientId(clientId);
    }
    @GetMapping("/find/{creditId}")
    public Mono<Credit> findByCreditId(@PathVariable("creditId") String creditId){
        return service.findByCreditId(creditId);
    }
    @PostMapping
    public Mono<Credit> create(@RequestBody Credit credit){
        return service.create(credit);
    }

    @PostMapping("/update")
    public Mono<Credit> update(@RequestBody Credit credit){
        return service.create(credit);
    }

    @DeleteMapping
    public Mono<Credit> delete(@RequestBody Credit credit){
        return service.delete(credit);
    }

    @DeleteMapping("/byId/{id}")
    public Mono<Credit> deleteById(@RequestBody String id){
        return service.deleteById(id);
    }

}