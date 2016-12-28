package movies.spring.data.neo4j.repositories;

import movies.spring.data.neo4j.MyNeo4jTestConfiguration;
import movies.spring.data.neo4j.services.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhzy on 2016/12/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyNeo4jTestConfiguration.class)
@ActiveProfiles(profiles = "test")
public class test {

    @Autowired
    private TestService testService;

    @Test
    public void testa(){
        testService.create();
    }
}
