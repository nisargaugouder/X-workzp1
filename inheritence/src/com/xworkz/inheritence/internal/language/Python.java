package com.xworkz.inheritence.internal.language;

public class Python {
    public void tech(Language language){
        language.communicate();
        language.grammar();
        language.origin();
        language.speak();
        language.write();

        if(language instanceof Java){
            System.out.println("language instanceof Java");
            Java java=new Java();
            java.difficult();
        }
    }
}
