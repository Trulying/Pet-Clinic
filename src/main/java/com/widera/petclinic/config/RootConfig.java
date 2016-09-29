package com.widera.petclinic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by maciek on 27.09.16.
 */
@Configuration
@Import({com.widera.petclinic.config.WebConfig.class, com.widera.petclinic.config.DataConfig.class})
public class RootConfig {

}
