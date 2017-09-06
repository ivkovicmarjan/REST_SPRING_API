package ch.praesentation.repository;

import ch.praesentation.model.Notes;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

// https://stackoverflow.com/questions/24839760/spring-boot-responsebody-doesnt-serialize-entity-id

@Configuration
public class RepositoryConfiguration extends RepositoryRestConfigurerAdapter{

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Notes.class);
    }
}
