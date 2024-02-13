package ru.hogwarts.hogwartsliquibase.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.hogwarts.hogwartsliquibase.model.Faculty;

public class InfoController {

    @Value("${server.port}")
    private int port;


    @GetMapping()
    public ResponseEntity<Integer> port(){
        return ResponseEntity.ok(port);
    }




}
