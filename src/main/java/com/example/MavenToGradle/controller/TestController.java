package com.example.MavenToGradle.controller;

import com.example.MavenToGradle.dto.TestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/first-test")
    public ResponseEntity<TestDTO> getTestDTO(){
        TestDTO testDTO = new TestDTO(5L, "Илья", true);
        return new ResponseEntity<>(testDTO, HttpStatus.OK);
    }
}
