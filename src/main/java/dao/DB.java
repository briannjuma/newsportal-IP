package dao;

import org.sql2o.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DB {
    // heroku deployment
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-23-23-182-238.compute-1.amazonaws.com:5432/d32ika7btcmu7", "frgzxqpwnrjjyu", "f6dc2b453e987d20118fb9f2a6756c5ba9de22c74f12e447c8532ff62ac5024b");

    // local database connection
    // public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/news_portal_test", "njengabrayan", "UBUNTU");
//
//    private static URI dbUri;
//    public static Sql2o sql2o;
//
//
//    static Logger logger = LoggerFactory.getLogger(DB.class);
//
//    static {
//
//        try {
//            if (System.getenv("DATABASE_URL") == null) {
//                dbUri = new URI("postgres://localhost:5432/news_portal_test");
//            } else {
//                dbUri = new URI(System.getenv("DATABASE_URL"));
//            }
//            int port = dbUri.getPort();
//            String host = dbUri.getHost();
//            String path = dbUri.getPath();
//            String username = (dbUri.getUserInfo() == null) ? "njengabrayan" : dbUri.getUserInfo().split(":")[0];
//            String password = (dbUri.getUserInfo() == null) ? "UBUNTU" : dbUri.getUserInfo().split(":")[1];
//            sql2o = new Sql2o("jdbc:postgresql://" + host + ":" + port + path, username, password);
//        } catch (URISyntaxException e) {
//            logger.error("Unable to connect to database.");
//        }
//    }
}
