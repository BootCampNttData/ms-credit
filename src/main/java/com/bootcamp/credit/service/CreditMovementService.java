package com.bootcamp.credit.service;

import com.bootcamp.credit.model.CreditMovement;
import com.bootcamp.credit.model.CreditMovement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditMovementService {
    Flux<CreditMovement> findAll();
    Mono<CreditMovement> create(CreditMovement creditMovement);
    Flux<CreditMovement> findByCreditId(String id);
    Mono<CreditMovement> update(CreditMovement creditMovement);
    Mono<CreditMovement> deleteById(String id);
    Mono delete(CreditMovement creditMovement);
}
