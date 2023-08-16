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
public class GanjilGenap {
    public static void main(String[] args) {
        int input;
        Scanner masukan = new Scanner(System.in);
        System.out.println("===PROGRAM BILANGAN GANJIL GENAP===");
        System.out.print("Masukan Bilangan = ");
        input = masukan.nextInt();
        
        if(input % 2==0){
              System.out.print("Bilangan "+input+" adalah Genap!\n");
        }else{
            System.out.printf("Bilangan %d adalah Ganjil!\n", input);
        }
    }
}
