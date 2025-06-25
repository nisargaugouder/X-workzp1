package com.xworkz.holiday.dto;

import java.io.Serializable;

public class HolidayDTO implements Serializable {
    private String name;
    private String email;
    private String reason;
    private String start;
    private String end;

    public HolidayDTO(String name,String email,String reason,String start,String end){
        System.out.println("no-arg const");
        this.name=name;
        this.email=email;
        this.reason=reason;
        this.start=start;
        this.end=end;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
