package ru.isudo.ethereum.core.repository;


import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import ru.isudo.ethereum.core.model.Agreement;


public interface AgreementRepository extends CrudRepository<Agreement, Long>, QueryDslPredicateExecutor<Agreement> {

}