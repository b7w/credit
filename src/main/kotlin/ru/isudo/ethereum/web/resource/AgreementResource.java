package ru.isudo.ethereum.web.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.isudo.ethereum.core.model.Agreement;
import ru.isudo.ethereum.core.service.AgreementService;

import javax.transaction.Transactional;
import java.time.LocalDateTime;


@RestController
@RequestMapping("/agreement")
@Transactional
public class AgreementResource {

    @Autowired
    private AgreementService service;


    @RequestMapping("")
    public Iterable<Agreement> list() {
        return service.findAll();
    }

    @RequestMapping("/now")
    public String now() {
        return LocalDateTime.now().toString();
    }
}
