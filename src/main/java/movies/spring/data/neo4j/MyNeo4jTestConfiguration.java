package movies.spring.data.neo4j;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author pdtyreus
 */

@EnableTransactionManagement
@EnableAutoConfiguration
@ComponentScan(basePackages = {"movies.spring.data.neo4j.services"})
@Configuration
@EnableNeo4jRepositories(basePackages = "movies.spring.data.neo4j.repositories")
@Profile({"embedded", "test"})
public class MyNeo4jTestConfiguration extends Neo4jConfiguration {

    @Bean
    public org.neo4j.ogm.config.Configuration getConfiguration() {
        org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration();
        config
                .driverConfiguration()
                .setDriverClassName("org.neo4j.ogm.drivers.embedded.driver.EmbeddedDriver");
//                .setURI("file:///ProfessionalSoftware/Neo4jDB/importTest");
        return config;
    }

    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory(getConfiguration(), "movies.spring.data.neo4j.domain");
    }
}
