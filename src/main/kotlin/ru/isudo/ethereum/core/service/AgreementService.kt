package ru.isudo.ethereum.core.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.isudo.ethereum.core.model.Agreement
import ru.isudo.ethereum.core.repository.AgreementRepository
import ru.isudo.ethereum.core.service.eth.EthApi

@Service
class AgreementService {

    @Autowired
    private lateinit var repository: AgreementRepository

    @Autowired
    private lateinit var ethApi: EthApi

    fun findAll(): Iterable<Agreement> {
        return repository.findAll()
    }

    fun createFilterAndLoadChanges(address: String): List<EthApi.ContractChange> {
        val filterId = ethApi.newFilter(EthApi.FilterParams(address))
        val changes = ethApi.getFilterChanges(filterId)
        ethApi.uninstallFilter(filterId)
        return changes
    }
}
