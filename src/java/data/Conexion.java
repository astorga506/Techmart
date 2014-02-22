/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class Conexion {

    private String url;
    private String server;
    private String instance;
    private String database;
    private boolean integratedSecurity;
    private String user;
    private String password;
    private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private Connection connection;

    public Conexion() {
        server = "localhost:1433";
        instance = "LILITH\\SQLEXPRESS";
        database = "Techmart";
        integratedSecurity = true;
        setUrl();
    }

    public Conexion(String server, String instance, String database) {
        this.server = server;
        this.database = database;
        this.instance = instance;
        integratedSecurity = true;
        setUrl();
    }

    public Conexion(String server, String instance, String database, String user, String password) {
        this.server = server;
        this.instance = instance;
        this.database = database;
        this.user = user;
        this.password = password;
        setUrl();
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isIntegratedSecurity() {
        return integratedSecurity;
    }

    public void setIntegratedSecurity(boolean integratedSecurity) {
        this.integratedSecurity = integratedSecurity;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public final void setUrl() {

        if (integratedSecurity) {
            url = "jdbc:sqlserver://" + server + ";"
                    +"instanceName="+ instance +";"
                    + "databaseName=" + database + ";"
                    + "integratedSecurity=true;";

        } else {

            url = "jdbc:sqlserver://" + server + ";"
                    +"instanceName="+ instance +";"
                    + "databaseName=" + database + ";"
                    + "user=" + user + ";"
                    + "password=" + password + ";";
        }

    }

    public Connection getConnection() throws SQLException {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        connection = DriverManager.getConnection(url);

        return this.connection;

    }

}
