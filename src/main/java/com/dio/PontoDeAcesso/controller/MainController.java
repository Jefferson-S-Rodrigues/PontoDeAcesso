package com.dio.PontoDeAcesso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
@RequestMapping(path = "/")
public class MainController {

    @GetMapping
    public String swaggerUi() {
        return "redirect:/swagger-ui.html";
    }
}
