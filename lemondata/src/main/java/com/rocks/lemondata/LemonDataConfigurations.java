package com.rocks.lemondata;

import com.rocks.lemondata.repositories.SoulReaperRepository;
import com.rocks.lemondata.services.SoulReaperService;
import com.rocks.lemondata.services.SoulReaperServiceImpl;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.rocks.lemondata.entities")
@EnableJpaRepositories(basePackages = "com.rocks.lemondata.repositories")
public class LemonDataConfigurations {

    @Bean
    @Scope("prototype")
    public SoulReaperService getSoulReaperService(SoulReaperRepository repository) {
        return new SoulReaperServiceImpl(repository);
    }
}
