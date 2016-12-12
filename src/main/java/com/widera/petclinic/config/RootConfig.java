package com.widera.petclinic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({com.widera.petclinic.config.WebConfig.class,
        com.widera.petclinic.config.DataConfig.class,
        com.widera.petclinic.config.SecurityConfig.class})
public class RootConfig {

}
