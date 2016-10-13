package ru.isudo.ethereum.core.service.eth

import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties(ignoreUnknown = true)
data class Transaction(
        val blockHash: String = "",
        val blockNumber: String = "",
        val from: String? = "",
        val gas: String = "",
        val gasPrice: String = "",
        val hash: String = "",
        val input: String = "",
        val nonce: String = "",
        val to: String = "",
        val transactionIndex: String = "",
        val value: String = ""
)