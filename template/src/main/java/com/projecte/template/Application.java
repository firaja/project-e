package com.projecte.template;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class Application
{
    private static final Logger LOG = LogManager.getLogger();

    public static final String APPLICATION_NAME ="template";

    @Autowired
    private ApplicationContext applicationContext;

    @EventListener
    public void onStartUp(ContextRefreshedEvent event)
    {
        if (event.getApplicationContext().equals(this.applicationContext))
        {
            LOG.info("\uD83D\uDE80 Application {} is starting...", APPLICATION_NAME);
            LOG.info("\n  ____            _           _             \n"
                    + " |  _ \\ _ __ ___ (_) ___  ___| |_       ___ \n"
                    + " | |_) | '__/ _ \\| |/ _ \\/ __| __|____ / _ \\\n"
                    + " |  __/| | | (_) | |  __/ (__| ||_____|  __/\n"
                    + " |_|   |_|  \\___// |\\___|\\___|\\__|     \\___|\n"
                    + "               |__/                         \n"
                    + "    .: {} :.                            (v1.0)", APPLICATION_NAME);
        }
    }
}
