package com.projecte.cart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;


@SpringBootApplication
public class Application
{
    private static final Logger LOG = LogManager.getLogger();

    private static final String APPLICATION_NAME = "Cart Service";

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }


    @EventListener(ApplicationStartedEvent.class)
    public void whenStarting()
    {
        LOG.info("\uD83D\uDE80 Starting {}...", APPLICATION_NAME);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void whenReady()
    {
        LOG.info("\uD83C\uDD99 Application {} is ready!", APPLICATION_NAME);
    }






}
