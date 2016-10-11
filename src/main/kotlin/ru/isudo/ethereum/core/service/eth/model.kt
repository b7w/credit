package ru.isudo.ethereum.core.service.eth

import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties(ignoreUnknown = true)
data class Transaction(
        val hash: String,
        val from: String,
        val to: String?,
        val gas: Long,
        val gasPrice: Long,
        val value: Long,
        val input: Long
)