package com.akshu.learning;

import java.util.Arrays;

public class StringSplit {

    public static void main(String[] args) {
        String passworddetails = "Please find this password 'akshupassword' to login";

        String[] passwordArray = passworddetails.split("'");

        System.out.println(passwordArray[1]);



    }
}
