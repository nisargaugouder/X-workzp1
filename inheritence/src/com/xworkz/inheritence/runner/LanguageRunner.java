package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.language.Language;
import com.xworkz.inheritence.internal.language.Java;
import com.xworkz.inheritence.internal.language.Python;

public class LanguageRunner {
    public static void main(String[] args) {
        Language lang = new Language();
        lang.speak();
        lang.write();
        lang.communicate();
        lang.grammar();
        lang.origin();

        System.out.println("-----------");

        Language lang2 = new Java();
        lang2.speak();
        lang2.write();
        lang2.communicate();
        lang2.grammar();
        lang2.origin();

        System.out.println("-----------");

        Java java = new Java();
        java.speak();
        java.write();
        java.communicate();
        java.grammar();
        java.origin();

        System.out.println("----------casting");
        Python python=new Python();
        python.tech(lang);
        python.tech(lang2);
        python.tech(java);
    }
}
