package com.example.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceApi {
    private WebClient webClient;
    private DataRepository dataRepository;

    @Autowired
    public ServiceApi(WebClient webClient, DataRepository dataRepository) {
        this.webClient = webClient;
        this.dataRepository = dataRepository;
    }

    public Mono<Output> callApi() {
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder.path("api/v1/employees").build())
                .retrieve()
                .bodyToMono(Output.class)
                .map(output -> {
                    List<Value> updatedEmployeeDataList = output.getData().stream().
                            map(
                                    value -> {
                                        if(value.getEmployee_salary() > 100000) {
                                            value.setEligibleForLoan(true);
                                        }
                                        return value;
                                    }
                            ).

                            collect(Collectors.toList());

                    output.setData(updatedEmployeeDataList);

                    return output;
                });

    }
}

