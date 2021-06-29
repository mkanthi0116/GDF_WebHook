package com.mohan.javaprojects.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public interface HelloWorldApi {

    @GetMapping("/greeting")
    String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name);

    @PostMapping(value = "/webhook", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String webhook(@RequestBody String rawData);

}
