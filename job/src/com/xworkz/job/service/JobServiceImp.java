package com.xworkz.job.service;

import com.xworkz.job.dto.JobDTO;
import com.xworkz.job.repository.JobRepository;
import com.xworkz.job.repository.JobRepositoryImp;

public class JobServiceImp  implements JobService{

    public String validateAndSave(JobDTO jobDTO){
        System.out.println("running validateAndSave in JobServiceImp"+jobDTO);
        if(jobDTO != null){
            System.out.println("dto is valid");
            String name=jobDTO.getName();
            if(name==null || name.length()<4 || name.length()>30){

                System.out.println("name is invalid");
                return "please enter valid details";
            }
            System.out.println("data is valid...");
            JobRepository jobRepository=new JobRepositoryImp();
            jobRepository.save(jobDTO);

        }
        return "Details saved Successfully";
    }


}
