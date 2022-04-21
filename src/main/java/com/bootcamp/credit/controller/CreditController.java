package com.bootcamp.credit.controller;

import com.bootcamp.credit.model.Credit;
import com.bootcamp.credit.model.CreditMovement;
import com.bootcamp.credit.service.CreditMovementService;
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
    public final CreditMovementService creditMovementService;
    @GetMapping
    public Flux<Credit> getAllCredits(){
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
    public Mono<Credit> deleteCreditById(@RequestBody String id){
        return service.deleteById(id);
    }

/** ******************************************************************************************************/
    @GetMapping("/movement")
    public Flux<CreditMovement> getAllMovements(){
        return creditMovementService.findAll();
    }

    @GetMapping("/movement/byId/{idCredit}")
    public Flux<CreditMovement> getByIdCredit(@PathVariable("idCredit") String idCredit){
        return creditMovementService.findByCreditId(idCredit);
    }

    @PostMapping("/movement")
    public Mono<CreditMovement> create(@RequestBody CreditMovement creditMovement){
        return creditMovementService.create(creditMovement);
    }

    @DeleteMapping("/movement/byId/{id}")
    public Mono<CreditMovement> deleteMovementById(@RequestBody String id){
        return creditMovementService.deleteById(id);
    }




}