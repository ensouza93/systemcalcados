
package br.univel.systemcalcados.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WebSystem
 */
public class ConexaoDAO {
    
    public static final String DRIVER = "org.postgresql.Driver";
    public static final String URL = "jdbc:postgresql://localhost:5432/systemcalcados";
    public static final String SENHA = "postgres";
    public static final String USUARIO = "postgres";
    
    public static Connection criarConexao(){
        try {
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, USUARIO, SENHA);
            return con;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
    
}
