/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pskk2020;
import java.util.Scanner;
/**
 *
 * @author zaenalalfian
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        double C,R,F;
        Scanner masukan = new Scanner(System.in);
        System.out.println("===PROGRAM KONVERSI SUHU===");
        System.out.print("Masukan Nilai Celcius (C) = ");
        C = masukan.nextInt();
        R = C*4/5;
        F = C*9/5+32;
        System.out.printf("Nilai Celcius (C) = %f\n",C);
        System.out.printf("Nilai Reamur (Re) = %f\n",R);
        System.out.printf("Nilai Fahrenheit (F) = %f\n", F);
    }
}
