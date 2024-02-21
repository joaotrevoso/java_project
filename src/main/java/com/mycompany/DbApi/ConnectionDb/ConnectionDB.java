package com.mycompany.DbApi.ConnectionDb;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class ConnectionDB {

    public static JdbcRowSet DbConnect() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/joaopedro";
        String user ="root";
        String pass = "naosouobeso";

        try {

            JdbcRowSet rcb = RowSetProvider.newFactory().createJdbcRowSet();
            rcb.setUrl(url);
            rcb.setUsername(user);
            rcb.setPassword(pass);
            rcb.setAutoCommit(false);

            return  rcb;
        } catch (SQLException e) {

            e.printStackTrace();

        }

        throw new SQLException("Connection failed");

    }

}
