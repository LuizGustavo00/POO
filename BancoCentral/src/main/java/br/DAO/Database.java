package br.DAO;

import java.sql.*;

public abstract class Database {

    public Connection con;
    public PreparedStatement pst;
    public Statement st;
    public ResultSet rs;

    static String database = "ProjetoBD"; // nome do BD
    static final String user = "root";
    static final String password = "root";
    static final String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false";

    public void connectToDB(){
        try {
            con = DriverManager.getConnection(url,user,password);
            //System.out.println("Conexao funcionou");
        }catch(SQLException exc){
            System.out.println("Erro: "+ exc.getMessage());
        }
    }
}
