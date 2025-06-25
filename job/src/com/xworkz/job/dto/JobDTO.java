package com.xworkz.job.dto;

import java.io.Serializable;

public class JobDTO implements Serializable {

    private int id;
    private String name;
    private String email;
    private long convertedphone;
    private String qualification;

    public JobDTO(String name,String email,long convertedphone,String qualification){
        System.out.println("running jobDTO");
        this.name=name;
        this.email=email;
        this.convertedphone=convertedphone;
        this.qualification=qualification;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getConvertedphone() {
        return convertedphone;
    }

    public void setConvertedphone(long convertedphone) {
        this.convertedphone = convertedphone;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }



}
