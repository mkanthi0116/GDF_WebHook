package com.mohan.javaprojects.service;

import com.google.cloud.dialogflow.cx.v3.FulfillIntentResponse;
import com.mohan.javaprojects.api.HelloWorldApi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


@Component
public class HelloWorld implements HelloWorldApi {

    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello "+name;
    }

    @Override
    public String webhook(String rawData) {

        System.out.println(" WebHook Body: "+rawData);

       // FulfillIntentResponse fulfillIntentResponse = new Fu

        return "Hello Mohan Kanthi";
    }
}
