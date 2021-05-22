package com.spring.code.profile37;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Profile("dev")
    @Bean("devBean")
    public com.spring.code.profile37.Bean devBean() {
        return new com.spring.code.profile37.Bean("devBean");
    }

    @Profile("pro")
    @Bean("proBean")
    public com.spring.code.profile37.Bean proBean() {
        return new com.spring.code.profile37.Bean("proBean");
    }
}
