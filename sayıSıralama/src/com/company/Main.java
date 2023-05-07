package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int a,b,c,sonuc;

        System.out.print("Birinci Sayiyi Giriniz : ");
        a = giris.nextInt();
        System.out.print("İkinci Sayiyi Giriniz : ");
        b = giris.nextInt();
        System.out.print("Üçüncü Sayiyi Giriniz : ");
        c = giris.nextInt();

        if ((a>b)&&(a>c)){
            if (b>c){
                System.out.println("Sıralama : "+ a +" > "+ b + " > " + c);
            }else {
                System.out.println("Sıralama : "+ a + " > " + " > " + c + " > " + b);
            }
        } else if ((b>c) &&(b>a)) {
            if (a>c){
                System.out.println("Sıralama : "+ b + " > " + a + " > " + c);
            }else{
                System.out.println("Sıralama : "+ b +" > " + c + " > " + a);
            }
        }else {
            if ((b>a)){
                System.out.println("Sıralama : "+ c + " > " + b + " > " + a);
            }else {
                System.out.println("Sıralama : "+ c + " > " + a + " > " + b);
            }
        }
    }
}
