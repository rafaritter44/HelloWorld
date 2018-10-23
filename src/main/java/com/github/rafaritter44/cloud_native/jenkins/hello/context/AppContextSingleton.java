package com.github.rafaritter44.cloud_native.jenkins.hello.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.rafaritter44.cloud_native.jenkins.hello.config.AppConfig;

public class AppContextSingleton {

    private static class AppContextHolder {
        static final ApplicationContext INSTANCE = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    public static ApplicationContext getInstance() {
        return AppContextHolder.INSTANCE;
    }

    private AppContextSingleton() {}

}
