package ru.isudo.ethereum.core.service.eth

import com.googlecode.jsonrpc4j.JsonRpcMethod
import com.googlecode.jsonrpc4j.JsonRpcService


@JsonRpcService("/")
interface EthApi {

    @JsonRpcMethod("eth_mining")
    fun mining(): Boolean

    @JsonRpcMethod("eth_getTransactionByHash")
    fun getTransactionByHash(hash: String): Transaction?

    data class FilterParams(
            val address: String,
            val fromBlock: String = "0x1",
            val toBlock: String = "latest"
    )

    @JsonRpcMethod("eth_newFilter")
    fun newFilter(params: FilterParams): String

    data class ContractChange(
            val removed: Boolean,
            val logIndex: String,
            val transactionIndex: String,
            val transactionHash: String,
            val blockHash: String,
            val blockNumber: String,
            val address: String,
            val data: String,
            val topics: List<String>
    )

    @JsonRpcMethod("eth_getFilterChanges")
    fun getFilterChanges(filterId: String): List<ContractChange>

    @JsonRpcMethod("eth_uninstallFilter")
    fun uninstallFilter(filterId: String): Boolean
}
