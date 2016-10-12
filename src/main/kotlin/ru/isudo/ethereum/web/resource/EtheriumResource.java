package ru.isudo.ethereum.web.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.isudo.ethereum.core.service.AgreementService;
import ru.isudo.ethereum.core.service.eth.EthApi;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("/etherium")
@Transactional
public class EtheriumResource {

    @Autowired
    private AgreementService service;

    @RequestMapping("/{address}")
    public List<EthApi.ContractChange> getTransactionByHash(@PathVariable String address) {
        System.out.println("##" + address);
        return service.createFilterAndLoadChanges(address);
    }
}
