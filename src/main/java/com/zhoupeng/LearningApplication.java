package com.zhoupeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import java.util.Iterator;

@SpringBootApplication
public class LearningApplication {
    public static void main(String[] args) {
        ConfigurableEnvironment environment  = new SpringApplication(LearningApplication.class).run(args).getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        Iterator<PropertySource<?>> iterator = propertySources.iterator();
        while (iterator.hasNext()){
            PropertySource<?> next = iterator.next();
            System.out.println("next = " + next);
        }
    }
}
