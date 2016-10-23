package movies.spring.data.neo4j.services;

import movies.spring.data.neo4j.repositories.MovieRepository;
import org.neo4j.ogm.json.JSONArray;
import org.neo4j.ogm.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by hexu on 2016/10/18.
 */
@Service
@Transactional
public class MovieRoleService {

    @Autowired
    private MovieRepository movieRepository;

    public JSONObject toJSONFormat(String title){
        List<Map<String, Object>> personAndRoles= movieRepository.findByTitleRole(title);
        JSONObject prRole = new JSONObject();
        JSONArray personArray = new JSONArray();
        for(Map<String, Object> map:personAndRoles){
            String name = (String)map.get("person");
            JSONObject personObj = new JSONObject();
            JSONArray roleArray = new JSONArray();
            for(String role:(String[])map.get("cast")){
                roleArray.put(role);
            }
            try{
                personObj.put("name", name);
                personObj.put("roles", roleArray);
            }catch(Exception e){
                e.printStackTrace();
            }
            personArray.put(personObj);
        }
        try{
            prRole.put("person", personArray);
        }catch(Exception e){
            e.printStackTrace();
        }
        return prRole;
    }
}
