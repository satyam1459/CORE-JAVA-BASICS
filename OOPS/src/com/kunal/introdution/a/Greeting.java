package com.kunal.introdution.a;

//helps to return code in package b in Message java file-->
import static com.kunal.introdution.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("I am awesome");
        message();
    }
}
