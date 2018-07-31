package com.alibaba.edas;


import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboProvider {

    public static void main(String[] args) {
        PandoraBootstrap.run(args);
        SpringApplication.run(DubboProvider.class, args);
        PandoraBootstrap.markStartupAndWait();
    }

}