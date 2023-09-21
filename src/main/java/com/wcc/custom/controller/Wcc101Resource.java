package com.wcc.custom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wcc101")
public class Wcc101Resource {

    private final Logger log = LoggerFactory.getLogger(Wcc101Resource.class);

    @GetMapping("/test")
    public ResponseEntity<String> ecPay() {
        String result = "1|OK";
        return ResponseEntity.ok().body(result);
    }
}
