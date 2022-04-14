package com.rocks.limestone;

import com.rocks.lemondata.LemonDataConfigurations;
import com.rocks.lemondata.services.SoulReaperService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {AppConfiguration.class, LemonDataConfigurations.class})
public class AppConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(SoulReaperService service) {
        return args -> {
            service.AddSoulReaper(1L,"Genryusai Shigekuni Yamamoto",1);
            service.AddSoulReaper(2L,"Soifon",2);
            service.AddSoulReaper(3L,"Gin Ichimaru",3);
        };
    }
}
