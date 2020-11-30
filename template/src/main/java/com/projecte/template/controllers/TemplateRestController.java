package com.projecte.template.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projecte.template.Application;
import com.projecte.template.entities.TemplateEntity;
import com.projecte.template.repositories.TemplateRepository;


@RestController
public class TemplateRestController
{

    private static final Logger LOG = LogManager.getLogger();

    private static final String MESSAGE = "Hello, welcome to " + Application.APPLICATION_NAME + "!";

    @Autowired
    private TemplateRepository templateRepository;

    @GetMapping("/")
    public String get()
    {
        TemplateEntity templateEntity = new TemplateEntity();
        templateEntity.setId(MESSAGE);
        templateRepository.save(templateEntity);


        templateEntity = templateRepository.findById(MESSAGE).orElseThrow();

        LOG.info(templateEntity.getId());
        return templateEntity.getId();
    }

}
