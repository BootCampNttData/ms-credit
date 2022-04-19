package com.bootcamp.credit.controller;

import com.bootcamp.credit.model.CreditMovement;
import com.bootcamp.credit.service.CreditMovementService;
import com.bootcamp.credit.model.CreditMovement;
import com.bootcamp.credit.service.CreditMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/creditMovement")
@RequiredArgsConstructor
public class CreditMovementController {
    public final CreditMovementService service;
    @GetMapping
    public Flux<CreditMovement> getAll(){
        return service.findAll();
    }

    @GetMapping("/find/{num}")
    public Flux<CreditMovement> getByIdCredit(@PathVariable("num") String num){
        return service.findByCreditId(num);
    }

    @PostMapping
    public Mono<CreditMovement> create(@RequestBody CreditMovement creditMovement){
        return service.create(creditMovement);
    }

    @PostMapping("/update")
    public Mono<CreditMovement> update(@RequestBody CreditMovement creditMovement){
        return service.create(creditMovement);
    }

    @DeleteMapping
    public Mono<CreditMovement> delete(@RequestBody CreditMovement creditMovement){
        return service.delete(creditMovement);
    }

    @DeleteMapping("/byId/{id}")
    public Mono<CreditMovement> deleteById(@RequestBody String id){
        return service.deleteById(id);
    }

}