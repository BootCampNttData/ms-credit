package com.bootcamp.credit.repository;

import com.bootcamp.credit.model.CreditMovement;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CreditMovementRepository extends ReactiveCrudRepository<CreditMovement, String> {

    Flux<CreditMovement> findByCreditId(String idCredit);
}
