package org.example;

import Browser.Browser1;
import Excelpacakage.Test1;
import Page.Page1;

public class Main1 {
    public static void main(String[] args) throws Exception {
        Browser1 obj1 = new Browser1();
        obj1.setDriver();
        obj1.getUrl();

        Page1 obj2 = new Page1();
        obj2.popup();


        Test1 obj3 = new Test1();
        obj3.register();
        obj3.username();
        obj3.email();
        obj3.password();
        obj3.regbutton();
    }
}
