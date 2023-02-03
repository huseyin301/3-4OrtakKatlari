package Dongu;

import java.util.Scanner;

public class Kodlar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k, f = 0, c = 0;
        double ortalama;

        System.out.print("Bir sayı giriniz : ");
        k = sc.nextInt();

        for (int x = 0; x <= k; x++) {

            if (x % 3 == 0 && x % 4 == 0 && x > 0) {

                System.out.println(x);

                f++;
                c = c + x;
            }

        }

        ortalama = c / f;
        System.out.println("Sayıların ortalaması : " + ortalama);

    }
}
