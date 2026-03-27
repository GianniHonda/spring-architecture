package io.github.giannihonda.springarchitecture;

import io.github.giannihonda.springarchitecture.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMailAccess {

    @Autowired
    private  AppProperties properties;

    //@Bean
    public MailSender mailSender(){
        return null;
    }
}
