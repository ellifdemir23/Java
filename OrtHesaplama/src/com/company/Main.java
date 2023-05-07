package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int fiz , mat , müzik ,kimya ,trk , tarih;

        Scanner kul=new Scanner(System.in);

        System.out.println("Fizik notunuzu girin : ");
        fiz =kul.nextInt();

        System.out.println("Matematik notunuzu girin : ");
        mat =kul.nextInt();

        System.out.println("Müzik notunuzu girin : ");
        müzik =kul.nextInt();

        System.out.println("Kimya notunuzu girin : ");
        kimya =kul.nextInt();

        System.out.println("Türkçe notunuzu girin : ");
        trk =kul.nextInt();

        System.out.println("Tarih notunuzu girin : ");
        tarih =kul.nextInt();

       int top=(fiz+mat+müzik+kimya+trk+tarih);
       double ort= top/6.0 ;

        System.out.println("Ortalamanız: "+ort);

        String sonuc= ort>=60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız.";
        System.out.println(sonuc);


    }
}
