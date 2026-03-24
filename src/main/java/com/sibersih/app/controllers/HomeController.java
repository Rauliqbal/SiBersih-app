package com.sibersih.app.controllers;

import com.sibersih.app.DTO.response.WebResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public WebResponse<String> helloWorld() {
        return WebResponse.<String>builder()
                .success(true)
                .message("Hello World!")
                .build();

    }
}
