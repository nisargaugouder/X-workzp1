package com.xworkz.District;

public class District {
    Company company = new Company();
    Education education = new Education();
    Experience experience = new Experience();
    ExperienceDetail experienceDetail = new ExperienceDetail();
    HouseKeep houseKeep = new HouseKeep();
    Transport transport = new Transport();
    Ward ward = new Ward();

    public District() {
        this.company.location = "Banglore";
        this.company.numOfCompany = 450;
        this.company.compName = "TCS";

        this.education.location = "Shimogga";
        this.education.qualification = "B.E";
        this.education.studyYears = 12;

        this.experience.exp = true;
        this.experience.compName = "Info";
        this.experience.year = 21;

        this.experienceDetail.place = "Bangl";
        this.experienceDetail.noOfYear = 12;

        this.houseKeep.noOfPeople = 4;
        this.houseKeep.Name = "Maruthi";

        this.transport.ways = "Many";

        this.ward.WardNum = 451;
        this.ward.wardDetails = "Given in file";
    }
}
