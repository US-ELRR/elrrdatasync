/**
 *
 */

package com.deloitte.elrr.datasync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;


import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableScheduling
@ComponentScan({ "com.deloitte.elrr" })
@EnableEncryptableProperties
public class DatasyncApplication {

    /**
     *
     */
    @Autowired
    private Environment env;

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        SpringApplication.run(DatasyncApplication.class, args);
    }

    /**
     * This for returning the Rest Template.
     *
     * @param builder
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate(final RestTemplateBuilder builder) {
        return builder.build();
    }
}
