package com.alibaba.edas;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
@Component
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}