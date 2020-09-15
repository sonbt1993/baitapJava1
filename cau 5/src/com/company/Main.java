package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Toa do la");
        System.out.printf("x = ");
        Double x = input.nextDouble();
        System.out.printf("y = ");
        Double y = input.nextDouble();
        if((-2.5<=x&&x<=2.5)&&(-5<=y&&y<=5)){
            System.out.println("nam trong HCN");
        }else{System.out.println("nam ngoai HCN");}
    }
}
