import static spark.Spark.*;

import com.google.gson.Gson;
import dao.SQL2oSitemapDao;
import models.*;
import dao.Sql2oNewsDao;
import dao.Sql2oDeptDao;
import dao.Sql2oUserDao;

public class App {
    public static void main(String[] args) {



        get("/sitemap","application/json",(request, response) ->{
            return gson.toJson(sitemapDao.allPaths());
        });

        //filter
        after((req, res) -> res.type("application/json"));
    }
}
