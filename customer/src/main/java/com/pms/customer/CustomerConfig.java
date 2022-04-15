package com.pms.customer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {

    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
