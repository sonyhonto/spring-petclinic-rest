package org.springframework.samples.petclinic.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Encoders {

    @Bean
    public PasswordEncoder userPasswordEncoder() {
    return new BCryptPasswordEncoder(8);
    }

    // @SuppressWarnings("deprecation")
    // @Bean
    // public static NoOpPasswordEncoder passwordEncoderNoN() {
    //     return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    // }

}