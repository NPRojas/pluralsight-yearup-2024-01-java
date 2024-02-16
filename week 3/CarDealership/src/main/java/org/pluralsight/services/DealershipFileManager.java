package org.pluralsight.services;
import org.pluralsight.models.Dealership;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DealershipFileManager {
    DataSource dataSource;

    public DealershipFileManager() {
        String databaseURL = "jdbc:mysql://localhost:3306/dealership";
        String userName = "root";
        String password = "";

        dataSource = new BasicDataSource()
        {{
            setUrl(databaseURL);
            setUsername(userName);
            setPassword(password);
        }};
    }

    public Dealership getDealership() {
        return null;
    }

    public void SaveDealership(Dealership dealership) {

    }
}
