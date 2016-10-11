package ru.isudo.ethereum.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.isudo.ethereum.core.model.Agreement;
import ru.isudo.ethereum.core.repository.AgreementRepository;

@Service
public class AgreementService {

    @Autowired
    private AgreementRepository repository;

    public Iterable<Agreement> findAll() {
        return repository.findAll();
    }

}
