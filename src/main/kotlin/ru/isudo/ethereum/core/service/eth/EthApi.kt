package ru.isudo.ethereum.core.service.eth

import com.googlecode.jsonrpc4j.JsonRpcMethod
import com.googlecode.jsonrpc4j.JsonRpcService


@JsonRpcService("/")
interface EthApi {

    @JsonRpcMethod("eth_mining")
    fun mining(): Boolean

    @JsonRpcMethod("eth_getTransactionByHash")
    fun getTransactionByHash(hash: String): Transaction?
}
