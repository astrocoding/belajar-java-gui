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
public class LuasSegitiga {
    public static void main(String[] args) {
        int alas,tinggi;
        float luas;
        Scanner masukan = new Scanner(System.in);
        System.out.println("===PROGRAM MENGHITUNG LUAS SEGITIGA===");
        System.out.print("Masukan nilai Alas (cm) = ");
        alas = masukan.nextInt();
        System.out.print("Masukan nilai Tinggi (cm) = ");
        tinggi = masukan.nextInt();
        luas = (float) (alas*tinggi)/2;
        System.out.println("===================================");
        System.out.printf("%d cm x %d cm = %f cm\n", alas,tinggi,luas);
    }
}
