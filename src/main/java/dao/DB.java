package dao;

public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/news_portal", "njengabrayan", "UBUNTU");
}
