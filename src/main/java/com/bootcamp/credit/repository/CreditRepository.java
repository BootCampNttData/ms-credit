package com.bootcamp.credit.repository;

import com.bootcamp.credit.model.Credit;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditRepository extends ReactiveCrudRepository<Credit, String> {
    Flux<Credit> findByClientId(String id);
    Mono<Credit> findByCreditId(String id);


}
