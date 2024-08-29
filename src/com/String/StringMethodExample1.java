package com.String;

import java.util.Scanner;

public class StringMethodExample1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter city name");
        String name = scan.nextLine().toLowerCase().trim();
        if(name.equals("porsa")){
            System.out.println("Hello Porsa");
        }
        else if(name.equals("ambah")){
            System.out.println("Hello Ambah");
        }
        else if (name.equals("morena")) {
            System.out.println("Hello Morena");
        }
        else{
            System.out.println("Enter valid city name");
        }
        scan.close();
    }
}

