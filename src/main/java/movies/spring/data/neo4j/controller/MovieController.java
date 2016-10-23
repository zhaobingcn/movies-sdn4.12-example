package movies.spring.data.neo4j.controller;

import movies.spring.data.neo4j.services.MovieRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hexu on 2016/10/18.
 */
@RestController
public class MovieController {

    @Autowired
    private MovieRoleService movieRoleService;

    @RequestMapping("/role")
    public String role(@RequestParam(value = "title", required = false) String title){
        System.out.println("热布署");
        return movieRoleService.toJSONFormat(title).toString();
    }
}
