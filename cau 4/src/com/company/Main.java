package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap canh 1");
        double a = input.nextDouble();
        System.out.println("Nhap canh 2");
        double b = input.nextDouble();
        System.out.println("Nhap canh 3");
        double c = input.nextDouble();
        double chuvi = a + b + c;
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("Chu vi la:" + chuvi);
        }else { System.out.println("Nhap lai");}

    }

}
