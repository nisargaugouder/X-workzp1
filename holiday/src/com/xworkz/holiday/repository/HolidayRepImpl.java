package com.xworkz.holiday.repository;

import com.xworkz.holiday.dto.HolidayDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HolidayRepImpl implements Holidayrep {
    @Override
    public String save(HolidayDTO holidayDTO) {
        System.out.println("running save in HolidayRepImpl");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/earth";
            String username = "root";
            String password = "2003";

            // create connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // prepare statement (with correct column names)
            String sql = "INSERT INTO application(id, name, email, reason, start_date, end_date) " +
                    "VALUES (0, '" + holidayDTO.getName() + "', '" + holidayDTO.getEmail() + "', '" +
                    holidayDTO.getReason() + "', '" + holidayDTO.getStart() + "', '" + holidayDTO.getEnd() + "')";

            Statement statement = connection.createStatement();

            // execute the statement
            statement.executeUpdate(sql);
            System.out.println(connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "";
    }
}
