package movies.spring.data.neo4j.controller;

import movies.spring.data.neo4j.domain.Movie;
import movies.spring.data.neo4j.repositories.MovieRepository;
import movies.spring.data.neo4j.services.MovieRoleRestService;
import movies.spring.data.neo4j.services.MovieRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by hexu on 2016/10/18.
 */
@RestController

public class MovieController {

    @Autowired
    private MovieRoleService movieRoleService;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieRoleRestService movieRoleRestService;

    @RequestMapping(value = "/role", produces = {"application/json;charset=UTF-8"})
    public String role(@RequestParam(value = "title", required = false) String title){
        System.out.println(title);
        return movieRoleService.toJSONFormat(title).toString();
    }

    @RequestMapping(value = "/title")
    public Collection<Movie> title(@RequestParam(value = "title", required = false) String title){
        System.out.println(title);
        return movieRepository.findByTitleContaining(title);
    }

    @RequestMapping(value = "/newRole")
    public void bewRole(@RequestParam(value = "title", required = false) String title){
        movieRoleRestService.toJSONFormat(title);
    }

    @RequestMapping(value = "/testRole")
    public Movie testRole(@RequestParam(value = "title", required = false) String title){
        return movieRepository.findByTitle(title);
    }
}
