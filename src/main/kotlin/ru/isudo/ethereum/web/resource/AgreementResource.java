package ru.isudo.ethereum.web.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.isudo.ethereum.core.model.Agreement;
import ru.isudo.ethereum.core.service.AgreementService;
import ru.isudo.ethereum.core.service.eth.EthApi;
import ru.isudo.ethereum.core.service.eth.Transaction;

import javax.transaction.Transactional;
import java.time.LocalDateTime;


@RestController
@RequestMapping("/agreement")
@Transactional
public class AgreementResource {

    @Autowired
    private AgreementService service;

    @Autowired
    private EthApi ethApi;

    @RequestMapping("")
    public Iterable<Agreement> list() {
        return service.findAll();
    }

    @RequestMapping("/now")
    public String now() {
        return LocalDateTime.now().toString();
    }

    @RequestMapping("/mining")
    public Boolean mining() {
        return ethApi.mining();
    }

    @RequestMapping("/{hash}")
    public Transaction getTransactionByHash(@PathVariable String hash) {
        return ethApi.getTransactionByHash(hash);
    }
}
