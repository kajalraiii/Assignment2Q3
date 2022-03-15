package com.example.SpringApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;



@RestController
public class ApiController {
    private ServiceApi serviceApi;

    @Autowired
    public ApiController(ServiceApi serviceApi) {
        this.serviceApi = serviceApi;
    }

    @GetMapping("/listapi")
    public Mono<Output> savecallApi() {
        return serviceApi.callApi();

    }
}


