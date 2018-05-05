package com.github.springrest.sampleRESTapp.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String start() {
        return "Internship rest app";
    }

    @RequestMapping(value = PATH)
    public String error() {
        return "handling options: /films, films/film?id=nr, /add";
    }

    @Override
    public String getErrorPath() {
        return PATH;

    }
}
