package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double toplamtutar;
        double armut, elma, domates, muz, patlican;
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5;

        System.out.println("Armut kaç kilo?");
        armut = giris.nextDouble();

        System.out.println("Elma kaç kilo?");
        elma = giris.nextDouble();

        System.out.println("Domates kaç kilo?");
        domates = giris.nextDouble();

        System.out.println("Muz kaç kilo?");
        muz = giris.nextDouble();

        System.out.println("Patlıcan kaç kilo?");
        patlican = giris.nextDouble();
        
        toplamtutar = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlican * patlicanFiyat);
        System.out.println(toplamtutar);    }
}
