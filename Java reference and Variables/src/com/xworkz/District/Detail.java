package com.xworkz.District;

public class Detail {
    public static void display() {
        District district = new District();

        System.out.println("Company Name: " + district.company.compName);
        System.out.println("Company Location: " + district.company.location);
        System.out.println("Number of Companies: " + district.company.numOfCompany);

        System.out.println("Education Location: " + district.education.location);
        System.out.println("Qualification: " + district.education.qualification);
        System.out.println("Years of Study: " + district.education.studyYears);

        System.out.println("Has Experience: " + district.experience.exp);
        System.out.println("Experience Company: " + district.experience.compName);
        System.out.println("Years of Experience: " + district.experience.year);

        System.out.println("Experience Place: " + district.experienceDetail.place);
        System.out.println("Years in Experience Detail: " + district.experienceDetail.noOfYear);

        System.out.println("HouseKeep People: " + district.houseKeep.noOfPeople);
        System.out.println("HouseKeep Name: " + district.houseKeep.Name);

        System.out.println("Transport Ways: " + district.transport.ways);

        System.out.println("Ward Number: " + district.ward.WardNum);
        System.out.println("Ward Details: " + district.ward.wardDetails);
    }
}
