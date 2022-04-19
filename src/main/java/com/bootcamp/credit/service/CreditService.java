package com.bootcamp.credit.service;

import com.bootcamp.credit.model.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
    Flux<Credit> findAll();
    Mono<Credit> create(Credit credit);
    Flux<Credit> findByClientId(String clientId);
    Mono<Credit> findByCreditId(String creditId);
    Mono<Credit> update(Credit credit);
    Mono<Credit> deleteById(String id);
    Mono delete(Credit credit);
}
