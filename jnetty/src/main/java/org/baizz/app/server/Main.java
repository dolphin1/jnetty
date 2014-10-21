package org.baizz.app.server;

import org.baizz.app.cfg.SpringConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.lang.invoke.MethodHandles;

/**
 * Created by baizz on 2014-10-21.
 */
public class Main {

    private static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        logger.debug("Starting application context ");
        @SuppressWarnings("resource")
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ctx.registerShutdownHook();
    }
}
