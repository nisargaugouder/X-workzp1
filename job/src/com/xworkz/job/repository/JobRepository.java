package com.xworkz.job.repository;

import com.xworkz.job.dto.JobDTO;

public interface JobRepository {

    String save(JobDTO jobDTO);

    default JobDTO findById(int id){
        return null;
    }
}
