package com.monkey.eurekaclient.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("dc")
    public String getDC(){

        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
