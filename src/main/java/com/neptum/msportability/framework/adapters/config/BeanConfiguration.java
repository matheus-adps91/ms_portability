package com.neptum.msportability.framework.adapters.config;

import com.neptum.msportability.PortabilityApp;
import com.neptum.msportability.application.ports.out.PortabilityRepository;
import com.neptum.msportability.application.ports.service.PortabilityServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfiguration
{
    @Bean PortabilityServiceImpl portabilityServiceImpl( PortabilityRepository portabilityRepository)
    {
        return new PortabilityServiceImpl( portabilityRepository );
    }
}