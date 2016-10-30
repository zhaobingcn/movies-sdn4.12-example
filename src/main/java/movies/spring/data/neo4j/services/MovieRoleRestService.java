package movies.spring.data.neo4j.services;

import movies.spring.data.neo4j.domain.Movie;
import movies.spring.data.neo4j.domain.Role;
import movies.spring.data.neo4j.repositories.MovieRepository;
import org.neo4j.ogm.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhzy on 2016/10/29.
 */
@Service
public class MovieRoleRestService {

    @Autowired
    private MovieRepository movieRepository;

    public JSONObject toJSONFormat(String title){
        Movie getMovie = movieRepository.findByTitle(title);
        List<Role> roles = getMovie.getRoles();
        for(Role rs:roles){
            for(String r:rs.getRoles()){
                System.out.println(r);
            }
            System.out.println(rs.getPerson().getName() + "  " + rs.getMovie().getTitle());
        }
        return null;
    }
}
