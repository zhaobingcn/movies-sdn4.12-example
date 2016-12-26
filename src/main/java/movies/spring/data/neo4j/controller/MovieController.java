package movies.spring.data.neo4j.controller;

import movies.spring.data.neo4j.domain.Movie;
import movies.spring.data.neo4j.services.MovieRoleService;
import movies.spring.data.neo4j.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by hexu on 2016/10/18.
 */
@RestController
public class MovieController {

    @Autowired
    private MovieRoleService movieRoleService;
    @Autowired
    private MovieService movieService;

    @RequestMapping("/role")
    public String role(@RequestParam(value = "title", required = false) String title){
        System.out.println("热布署");
        return movieRoleService.toJSONFormat(title).toString();
    }

    @RequestMapping("/graph")
    public Map<String, Object> graph(@RequestParam(value = "limit", required = false)int limit){
        return movieService.graph(limit);
    }
}
