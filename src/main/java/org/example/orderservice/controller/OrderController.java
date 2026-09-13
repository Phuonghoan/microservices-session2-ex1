package org.example.orderservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.orderservice.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService
            orderService;

    @GetMapping("/health-check")
    public ResponseEntity<String>
    healthCheck() {

        return ResponseEntity.ok(
                orderService.healthCheck()
        );
    }
}
