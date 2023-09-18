package com.spring.boot.mysql.war.controller;


import com.spring.boot.mysql.war.model.AgentTable;
import com.spring.boot.mysql.war.repository.AgentTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class DockerAppController {
    private final AgentTableRepository agentTableRepository;

    @GetMapping("/")
    public String greeting() {

        return "<h2>Welcome, Jenkins build and deploy Spring Boot MySQL War Demo</h2>";
    }
    @GetMapping("/{name}")
    public String helloPeople(@PathVariable("name") String name) {
        return "<h3>Hello, "+name+", welcome, now Jenkins will build and deploy any change Spring Boot MySQL War Demo</h3>";
    }


    @GetMapping("/findAllUsers")
    @ResponseStatus(HttpStatus.OK)
    public List<AgentTable> findAllUsers() {
        List<AgentTable> agentTableList= agentTableRepository.findAll();
        return agentTableList;
    }
}
