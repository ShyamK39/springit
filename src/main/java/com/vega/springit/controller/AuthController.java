package com.vega.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    @RequestMapping(value = {"/login", "/auth/login", "auth/login.html"})
    public String login() {
        return "auth/login";
    }
}
