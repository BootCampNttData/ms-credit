package com.bootcamp.credit.service.Impl;

import com.bootcamp.credit.model.Credit;
import com.bootcamp.credit.repository.CreditRepository;
import com.bootcamp.credit.service.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor

public class CreditServiceImpl implements CreditService {
    public final CreditRepository repository;

    @Override
    public Mono<Credit> create(Credit credit) {
        return repository.save(credit);
    }



    @Override
    public Mono<Credit> update(Credit credit) {
        return repository.save(credit);
    }

    @Override
    public Mono deleteById(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono delete(Credit credit) {
        return repository.delete(credit);
    }

    @Override
    public Flux<Credit> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<Credit> findByClientId(String id) {
        return repository.findByClientId(id);
    }

    public Mono<Credit> findByCreditId(String id) {
        return repository.findByCreditId(id);
    }
}