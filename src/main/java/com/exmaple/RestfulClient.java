package com.exmaple;

import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class RestfulClient {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate(Arrays.asList(new Jaxb2RootElementHttpMessageConverter()));

        Contact random = restTemplate.getForObject("http://localhost:8080/contact/random", Contact.class);
        System.out.println("Received: " + random);

        Contact edited = restTemplate.postForObject("http://localhost:8080/contact/edit", random, Contact.class);
        System.out.println("Edited: " + edited);
    }
}
