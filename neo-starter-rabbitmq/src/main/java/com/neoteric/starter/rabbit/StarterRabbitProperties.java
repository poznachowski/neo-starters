package com.neoteric.starter.rabbit;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("neostarter.rabbitmq")
public class StarterRabbitProperties {

    /**
     * Jackson TypeMapper package name eliglible for scanning.
     */
    private String packagesToScan = "com.neoteric";

}