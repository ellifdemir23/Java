package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int km;
        double perKm=2.2, tutar=10;

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = giris.nextInt();

        //Baslangic fiyatina kilometre başına ücret ekler.
        tutar += km*perKm;

        //20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        if(tutar<20)
            tutar=20;

        System.out.println("tutar = " + tutar);
    }
}
