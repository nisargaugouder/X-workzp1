package com.xworkz.holiday.service;

import com.xworkz.holiday.dto.HolidayDTO;
import com.xworkz.holiday.repository.HolidayRepImpl;
import com.xworkz.holiday.repository.Holidayrep;

public class HolidayServiceImpl implements HolidayService{

    @Override
    public String validate(HolidayDTO holidayDTO) {
        System.out.println("running validate in HolidayServiceImpl");
        if(holidayDTO != null){
            System.out.println("dto is valid");
            String name=holidayDTO.getName();
            String email=holidayDTO.getEmail();
            String reason=holidayDTO.getReason();

            if (name == null || name.length() < 4 || name.length() > 30) {
                System.out.println("Name is invalid");
                return "please enter valid name";
            }

            if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                System.out.println("Email is invalid");
                return "please enter valid email";
            }

            if (reason == null || reason.length() < 3 || reason.length() > 100) {
                System.out.println("Reason is invalid");
                return "please enter valid reason";
            }

            System.out.println("data is valid ....");
            Holidayrep holidayrep=new HolidayRepImpl();
            holidayrep.save(holidayDTO);
        }

        return "Application submitted Successfully";
    }
}
