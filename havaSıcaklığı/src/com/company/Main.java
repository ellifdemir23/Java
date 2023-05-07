package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int derece;
        System.out.print("Sıcaklığı giriniz");
        System.out.print(" Grup 1 < 5 ");
        System.out.print(" Grup 2 >= 5 and < 15 ");
        System.out.print(" Grup 3 >=15 < 25 ");
        System.out.print(" Grup 4 >=5 ");
        derece=giris.nextInt();
        if (derece==1)
            System.out.print("Kar topu oynayabilrsin");
        else if (derece==2)
            System.out.print("Sinemaya gidebilrsin");
        else if (derece==3)
            System.out.print("Piknik yapabilirsin");
        else
            System.out.print("Yüzmeye gidebilirsin");    }
}
