package com.xworkz.job.repository;

import com.xworkz.job.dto.JobDTO;

import java.sql.*;

public class JobRepositoryImp implements JobRepository{

    @Override
    public JobDTO findById(int id) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/earth";
            String username="root";
            String password="2003";

            Connection connection= DriverManager.getConnection(url,username,password);
            System.out.println("connection established");

            String sql="select * from jobdb where id="+id+"";
            System.out.println("SQL"+sql);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            System.out.println("resultSet"+resultSet);

            while (resultSet.next())
            {
                int pk=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String email=resultSet.getString("email");
                long phone=resultSet.getLong("phone");
                String qualification=resultSet.getString("qualification");

                JobDTO jobDTO=new JobDTO(name,email,phone,qualification);
                jobDTO.setId(pk);

            }

        }catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }

        return JobRepository.super.findById(id);
    }


    @Override
    public String save(JobDTO jobDTO) {
        System.out.println("ruuning save in JobRepo..");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/earth";
            String username="root";
            String password="2003";

            //create connection
            Connection connection= DriverManager.getConnection(url,username,password);

            //prepare the statement
            String sql="insert into jobdb values('0','"+jobDTO.getName()+"','"+jobDTO.getEmail()+"','"+jobDTO.getConvertedphone()+"','"+jobDTO.getQualification()+"')";

            Statement statement=connection.createStatement();

            //Execute the statement
            statement.executeUpdate(sql);
            System.out.println(connection);
        }catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }


        return "";
    }
}
