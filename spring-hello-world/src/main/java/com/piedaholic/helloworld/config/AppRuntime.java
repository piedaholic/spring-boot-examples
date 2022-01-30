package com.piedaholic.helloworld.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class AppRuntime implements WebServerFactoryCustomizer<ConfigurableWebServerFactory>{

    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(8083);
    }
    
}
