package com.bootcamp.credit.service.Impl;

import com.bootcamp.credit.model.CreditMovement;
import com.bootcamp.credit.repository.CreditMovementRepository;
import com.bootcamp.credit.service.CreditMovementService;
import com.bootcamp.credit.model.CreditMovement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor

public class CreditMovementServiceImpl implements CreditMovementService {
    public final CreditMovementRepository repository;

    @Override
    public Mono<CreditMovement> create(CreditMovement creditMovement) {
        return repository.save(creditMovement);
    }

    @Override
    public Mono<CreditMovement> update(CreditMovement creditMovement) {
        return repository.save(creditMovement);
    }

    @Override
    public Mono deleteById(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono delete(CreditMovement creditMovement) {
        return repository.delete(creditMovement);
    }

    @Override
    public Flux<CreditMovement> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<CreditMovement> findByCreditId(String id) {
        return repository.findByCreditId(id);
    }
}