package br.com.feministech;

import java.sql.*;

public class App
{
    public static void main( String[] args )
    {
        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:db.db")) {
            Statement stmt = connection.createStatement();
            stmt.execute("CREATE TABLE user ( name STRING)");
            stmt.execute("INSERT INTO user VALUES ('Patrícia')");
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM user");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                System.out.println("Início dos resultados:");
                String nome = rs.getString("name");
                System.out.println(nome);
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
