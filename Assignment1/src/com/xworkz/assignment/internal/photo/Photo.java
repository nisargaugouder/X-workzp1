package com.xworkz.assignment.internal.photo;

public class Photo {
    private String title;
    private String location;
    private String dateTaken;

    public Photo(String title, String location, String dateTaken) {
        this.title = title;
        this.location = location;
        this.dateTaken = dateTaken;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", dateTaken='" + dateTaken + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("PhotoHashCode:"+super.hashCode());
        return 45;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Photo){
                System.out.println("obj instance of class");
                Photo photo1=this;
                Photo photo2=(Photo) obj;
                if(photo1.dateTaken==photo2.dateTaken && photo1.location.equals(photo2.location) && photo1.title.equals(photo2.title)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
