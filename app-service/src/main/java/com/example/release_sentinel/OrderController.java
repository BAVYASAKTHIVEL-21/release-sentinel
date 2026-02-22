package com.example.release_sentinel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public String orders() {
        return "Orders working!";
    }

    @GetMapping("/slow")
    public String slow() throws InterruptedException {
        Thread.sleep(2000);
        return "Slow endpoint";
    }

    @GetMapping("/error")
    public String error() {
        throw new RuntimeException("Simulated failure");
    }
}