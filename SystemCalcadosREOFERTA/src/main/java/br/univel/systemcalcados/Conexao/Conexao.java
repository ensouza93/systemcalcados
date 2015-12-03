package br.univel.systemcalcados.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao{
    public static Connection getConnection() {

        Connection conn = null;

        String url = "jdbc:postgresql://localhost:5432/systemcalcados";
        String driver = "org.postgresql.Driver";
        String userName = "postgres";
        String password = "postgres";
        try {

            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return conn;
    }
}
