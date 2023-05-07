package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double fiyat;

        Scanner kul=new Scanner(System.in);
        System.out.println("Lütfen fiyatı giriniz : ");
        fiyat= kul.nextDouble();

        if (fiyat<=1000){
            fiyat*=0.18;
            System.out.println("Ürünün kdvli fiyatı : "+fiyat);
        }
        else {
            fiyat*=0.08;
            System.out.println("Ürünün kdvli fiyatı : "+fiyat);
        }
    }
}
