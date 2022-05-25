package com.shq.codedeploydemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestController {

    @GetMapping("api/health")
    public ResponseEntity<?> healtCheck() {
        return  ResponseEntity.ok("works successfully.");
    }
}
