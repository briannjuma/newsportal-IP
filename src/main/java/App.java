import static spark.Spark.*;

import com.google.gson.Gson;
import dao.SQL2oSitemapDao;
import models.*;
import dao.Sql2oNewsDao;
import dao.Sql2oDeptDao;
import dao.Sql2oUserDao;

public class App {
    public static void main(String[] args) {
        Sql2oDeptDao deptDao = new Sql2oDeptDao();
        Sql2oUserDao userDao = new Sql2oUserDao();
        Sql2oNewsDao newsDao = new Sql2oNewsDao();
        SQL2oSitemapDao sitemapDao = new SQL2oSitemapDao();
        Gson gson = new Gson();

        ProcessBuilder process = new ProcessBuilder();
        int port;

        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }
        port(port);


        //  find available departments
        get("/departments","application/json",(request, response) -> gson.toJson(deptDao.allDepartments()));

        //  create new department
        post("/departments/new","application/json",(request, response) -> {
            Department department = gson.fromJson(request.body(),Department.class);
            deptDao.add(department);
            response.status(201);
            return gson.toJson(department);
        });

        //  find users inside a department
        get("/departments/:deptId/users/:userId/details","application/json",(request, response) -> {
            int userId = Integer.parseInt(request.params("userId"));
            User foundUser = userDao.findById(userId);

            if (foundUser != null) {
                return gson.toJson(foundUser);
            }
            else {
                return "{\"Error 404!\":\"User not found\"}";
            }
        });
        get("/departments/:deptId/details","application/json",(request, response) -> {
            int deptId = Integer.parseInt(request.params("deptId"));
            return gson.toJson(deptDao.findById(deptId));
        });









        get("/sitemap","application/json",(request, response) ->{
            return gson.toJson(sitemapDao.allPaths());
        });

        //filter
        after((req, res) -> res.type("application/json"));
    }
}
