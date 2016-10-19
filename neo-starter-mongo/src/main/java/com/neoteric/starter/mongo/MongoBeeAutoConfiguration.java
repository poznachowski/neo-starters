package com.neoteric.starter.mongo;

import com.github.mongobee.Mongobee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MongoBeeAutoConfiguration {

    @Bean
    public Mongobee mongobee(Environment environment) {
        Mongobee runner = new Mongobee("uri");
        runner.setChangeLogsScanPackage(
                "com.example.yourapp.changelogs"); // package to scan for changesets
        runner.setEnabled(true);         // optional: default is true
        runner.setSpringEnvironment(environment);
        return runner;
    }
}
