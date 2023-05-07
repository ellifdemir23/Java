package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a , b , c , u , alan ;

        Scanner giris = new Scanner(System.in);

        System.out.print("Üçgenin ilk kenar uzunluğunu giriniz:");
        a = giris.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz:");
        b = giris.nextDouble();
        
        c = Math.sqrt((a*a)+(b*b));
        u = (a+b+c)/2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c)) ;
        System.out.println("Üçgenin Hipotenüs Uzunluğu:" + c);
        System.out.print("Üçgenin alanı:" + alan );
    }
}
