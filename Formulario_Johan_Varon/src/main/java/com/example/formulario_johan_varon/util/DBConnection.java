package com.example.formulario_johan_varon.util;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL= "jdbc:mysql://aws.connect.psdb.cloud/javv?sslMode=VERIFICAR_IDENTIDAD" ;

    private static final  String USER="zbj6ff857nbftetsg7io";
    private static final  String PASS="pscale_pw_3wpy1ZcM1grWT3sd8lo7S8OWXKXDvCII9yBxC4AUGzP";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException{
        if (pool==null){

            pool=new BasicDataSource();
            pool.setUrl(URL);
            pool.setUrl(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);

        }
        return pool;


    }// getConnectionToDatabase
    public  static Connection getConnection() throws SQLException{
        return getInstance().getConnection();
    }


}
