package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yaricap,acı;
        double pi=3.14,cevre,alan;

        Scanner giris = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz = ");
        yaricap=giris.nextInt();

        System.out.print("Hesaplamak istediğiniz parçanın merkez açısını giriniz = ");
        acı=giris.nextInt();

        cevre=2*pi*yaricap;
        System.out.println("Dairenin cevresi = " +cevre);

        alan=(pi * (yaricap*yaricap) * acı) / 360;
        System.out.println("Dairenin alanı = " +alan);    }
}
