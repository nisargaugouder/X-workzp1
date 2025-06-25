package com.xworkz.job.service;

import com.xworkz.job.dto.JobDTO;

public interface JobService {

    String validateAndSave(JobDTO jobDTO);

    default JobDTO findById(int id){
        return null;
    }
}
