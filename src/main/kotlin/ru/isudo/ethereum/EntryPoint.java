package ru.isudo.ethereum;

import org.springframework.boot.SpringApplication;
import ru.isudo.ethereum.env.Application;


public class EntryPoint {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}