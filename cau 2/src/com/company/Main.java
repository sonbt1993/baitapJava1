package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
            Scanner input =  new Scanner(System.in);

            System.out.println("nam");
        int nam = input.nextInt();

        switch (nam) {
            case 0:
                System.out.println("Tý");
                break;
            case 1:
                System.out.println("Sửu");
                break;
            case 2:
                System.out.println("Dần");
                break;
            case 3:
                System.out.println("Mão");
                break;
            case 4:
                System.out.println("Thìn");
                break;
            case 5:
                System.out.println("Tỵ");
                break;
            case 6:
                System.out.println("Ngọ");
                break;
            case 7:
                System.out.println("Mùi");
                break;
            case 8:
                System.out.println("Thân");
                break;
            case 9:
                System.out.println("Dậu");
                break;
            case 10:
                System.out.println("Tuất");
                break;
            case 11:
                System.out.println("Hợi");
                break;
            default:System.out.println("nhap lai");
                }

    }
}
