package com.vega.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping(path = "/", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public String home() {
        return "index";
    }
}
