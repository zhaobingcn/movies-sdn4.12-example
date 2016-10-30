package movies.spring.data.neo4j.repositories;

import movies.spring.data.neo4j.MyNeo4jConfiguration;
import movies.spring.data.neo4j.SampleMovieApplication;
import movies.spring.data.neo4j.domain.Movie;
import movies.spring.data.neo4j.domain.Person;
import movies.spring.data.neo4j.domain.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Created by zhzy on 2016/10/26.
 */
/*
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleMovieApplication.class)
public class addTest {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void addItem(){
        Movie newMovie = new Movie();
        newMovie.setReleased(1995);
        newMovie.setTagline("这是一个关于励志的故事");
        newMovie.setTitle("阿甘正传");

        movieRepository.save(newMovie);

        Person newPerson = new Person();
        newPerson.setName("汤姆汉克斯");
        newPerson.setBorn(1970);

        personRepository.save(newPerson);

        Role newRole = new Role();
        newRole.setMovie(newMovie);
        newRole.setPerson(newPerson);
        Collection<String> roleNames = new HashSet<>();
        roleNames.add("阿甘");
        newRole.setRoles(roleNames);

        List<Role> roles = new ArrayList<>();
        roles.add(newRole);

        newMovie.setRoles(roles);

        movieRepository.save(newMovie);

    }
}
*/