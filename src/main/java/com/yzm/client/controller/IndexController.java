package com.yzm.client.controller;

import com.yzm.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class IndexController {
    private final ClientService clientService;

    @Autowired
    public IndexController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public String get() {
        return this.clientService.get();
    }
}
