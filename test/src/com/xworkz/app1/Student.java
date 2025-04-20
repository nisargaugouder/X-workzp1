package com.xworkz.app1;

public class Student {
    int[] score={15,25,35,45,55,65,75};
    int count1=0;
    int count2=0;
     public void Sort(){
         for(int no:score){
             if(no>=0 && no<20){
                 count1=count1+1;
                 System.out.println("score btw 0 to 20: "+count1);
             } else if (no>=20 && no<40) {
                 count2=count2+1;
                 System.out.println("score btw 20 to 40: "+count2);
             }
             else{
                 System.out.println("invalid");
             }
         }
     }

}
