package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Nam ");
        int year = input.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.printf("nam nhuan");
                }
                else {System.out.printf("nam khong nhuan");}
            }
            else {System.out.printf("nam nhuan");}
        }else {System.out.printf("nam khong nhuan");}
    }
}
