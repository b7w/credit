package ru.isudo.ethereum.env;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.googlecode.jsonrpc4j.ProxyUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.isudo.ethereum.core.service.eth.EthApi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;


@Configuration
public class EthRpcConfiguration {

    @Value("${app.eth.api.host}")
    public String url;

    @Bean
    public EthApi ethApi() throws MalformedURLException {
        Objects.requireNonNull(url);
        JsonRpcHttpClient client = new JsonRpcHttpClient(new URL(url));
        return ProxyUtil.createClientProxy(
                getClass().getClassLoader(),
                EthApi.class,
                client
        );
    }
}
