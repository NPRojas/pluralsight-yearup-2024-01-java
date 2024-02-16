package org.pluralsight.services;
import org.pluralsight.models.Dealership;
import org.apache.commons.dbcp2.BasicDataSource;
import org.pluralsight.models.Vehicle;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DealershipFileManager {
    DataSource dataSource;

    public DealershipFileManager() {
        String databaseURL = "jdbc:mysql://localhost:3306/dealership";
        String userName = "root";
        String password = "YUm15510n";

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

    public ArrayList<Vehicle> getVehiclesByYear(int year) {

        ArrayList<Vehicle> vehicles =  new ArrayList<>();

        try(Connection connection = dataSource.getConnection()) {
            String sql = "SELECT vin " +
                    "   , year " +
                    "   , make " +
                    "   , model " +
                    "   , type " +
                    "   , color " +
                    "   , miles " +
                    "   , price " +
                    " FROM vehicles " +
                    " WHERE year = ?; ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, year);

            ResultSet rows = statement.executeQuery();

            while(rows.next()) {
                Vehicle vehicle = new Vehicle(rows.getInt("vin"),
                        rows.getInt("year"),
                        rows.getString("make"),
                        rows.getString("model"),
                        rows.getString("type"),
                        rows.getString("color"),
                        rows.getInt("miles"),
                        rows.getDouble("price"));

                vehicles.add(vehicle);
            };
        }
        catch (SQLException e) {
            // handle the error
            System.out.println(e);
        }
        return vehicles;
    }
}
