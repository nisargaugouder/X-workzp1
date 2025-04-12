package com.xworkz.assignment.internal.language;

public class Language {
    private String name;
    private int speakers;
    private String type;

    public Language(String name, int speakers, String type) {
        this.name = name;
        this.speakers = speakers;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Language{name='" + name + "', speakers=" + speakers + ", type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("LangHashCode:"+super.hashCode());
        return 8;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Language){
                System.out.println("have ref.will compare..");
                Language language1=this;
                Language language2=(Language) obj;
                if(language1.name.equals(language2.name) && language1.type.equals(language2.type)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
