package com.kcbgroup.main.service;

import com.kcbgroup.main.model.AccountInfo;
import com.kcbgroup.main.model.CustomerInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ConsumingRest {
    private static final Logger LOGGER= LoggerFactory.getLogger(ConsumingRest.class);
   private RestTemplate restTemplate;
    public ConsumingRest(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();

    }
public AccountInfo[] getCustomer(String identityNumber){

        String URL = "https://localhost:5078/api/test";

        return restTemplate.exchange(URL, HttpMethod.GET,null,AccountInfo[].class).getBody();
}

}
