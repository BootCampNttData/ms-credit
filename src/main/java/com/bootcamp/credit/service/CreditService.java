package com.bootcamp.credit.service;

import com.bootcamp.credit.model.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
    Flux<Credit> findAll();
    Mono<Credit> create(Credit credit);
    Flux<Credit> findByClientId(String id);
    Mono<Credit> findByCreditId(String id);
    Mono<Credit> update(Credit credit);
    Mono<Credit> deleteById(String id);
    Mono delete(Credit credit);
}
