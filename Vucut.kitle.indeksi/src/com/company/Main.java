package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double boy,kilo,ki;

        Scanner giris=new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz (Örn. 1,72) = ");
        boy=giris.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz (Örn. 68,5) = ");
        kilo=giris.nextDouble();
        
        ki=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz = "+ki);    }
}
