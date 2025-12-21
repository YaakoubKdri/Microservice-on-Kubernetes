package com.kadri.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class K8sDemoController {

    private final K8sDemoRepository repository;

    public K8sDemoController(K8sDemoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    public String hello(){
        repository.save(new Message("Hello from k8s"));
        return "Hello from Spring boot + MongoDB";
    }
}
