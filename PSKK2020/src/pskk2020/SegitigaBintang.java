/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pskk2020;

/**
 *
 * @author zaenalalfian
 */
public class SegitigaBintang {
    public static void main(String[] args) {
        int x,y; 
        System.out.println("===PROGRAM SEGITIGA BINTANG===");
       
        for(x = 2;x <= 6;x++){
            System.out.println("");
            for(y = 2;y <= x;y++){
                System.out.print(" * ");
            }
        }
        System.out.println();
    }
}
