package ru.isudo.ethereum.env;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "ru.isudo.ethereum")
@EnableJpaRepositories(basePackages = "ru.isudo.ethereum")
@EntityScan(basePackages = "ru.isudo.ethereum")
@EnableScheduling
public class Application {

}
