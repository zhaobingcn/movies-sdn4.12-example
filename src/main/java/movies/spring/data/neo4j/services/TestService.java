package movies.spring.data.neo4j.services;

import org.neo4j.graphdb.index.IndexHits;
import org.neo4j.graphdb.traversal.Paths;
import org.neo4j.helpers.collection.MapUtil;
import org.neo4j.ogm.model.Node;
import org.neo4j.ogm.model.Result;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.template.Neo4jOperations;
import org.springframework.data.neo4j.template.Neo4jTemplate;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by zhzy on 2016/12/26.
 */
public class TestService {

    @Autowired
    private Neo4jTemplate neo4jTemplate;

    @Autowired
    private Session session;

    @Transactional
    public void create(){

        Result result = neo4jTemplate.query("match path = (p:Person)-[:ACTED_IN]->(m:Movie) return path", MapUtil.stringMap());

    }
}
