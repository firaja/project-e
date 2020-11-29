package com.projecte.template.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projecte.template.Application;


@RestController
public class TemplateRestController
{

    private static final Logger LOG = LogManager.getLogger();

    private static final String MESSAGE = "Hello, welcome to " + Application.APPLICATION_NAME + "!";

    @GetMapping("/")
    public String get()
    {
        LOG.info(MESSAGE);
        return MESSAGE;
    }

}
