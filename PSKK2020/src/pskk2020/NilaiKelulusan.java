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
public class NilaiKelulusan {
    public static void main(String[] args) {
        String Nama = "Zaenal Alfian";
        double nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("===MENENTUKAN NILAI KELULUSAN===");
        System.out.printf("Nama = %s\n",Nama);
        System.out.print("Masukan Nilai = ");
        nilai = masukan.nextDouble();
        
        if((nilai >= 70) && (nilai <= 100)){
            System.out.printf("Nama = %s Nilai %f Anda Lulus!\n",Nama,nilai);
        }else if((nilai >= 0)&&(nilai < 70)){
            System.out.printf("Nama = %s Nilai %f Anda Tidak Lulus!\n",Nama,nilai);
        }else{
            System.out.println("DATA ANDA INVALID!");
        }
        
    }
}
