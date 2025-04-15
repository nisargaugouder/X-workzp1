package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.facebook.Facebook;
import com.xworkz.application.inheritancetype.facebook.SocialMedia;
import com.xworkz.application.inheritancetype.facebook.Website;

public class FacebookRunner {
    public static void main(String[] args) {
        Facebook facebook=new Facebook();
        facebook.open();
        facebook.postStatus();
        facebook.connect();

    }
}
