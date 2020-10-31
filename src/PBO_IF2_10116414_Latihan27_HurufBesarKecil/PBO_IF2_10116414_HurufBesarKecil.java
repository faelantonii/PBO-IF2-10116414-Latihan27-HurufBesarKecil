/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan27_HurufBesarKecil;
import java.util.Scanner;
/**
 *
 * @author sweenutt
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * DESKRIPSI    : Program Huruf Besar dan Kecil
 */
public class PBO_IF2_10116414_HurufBesarKecil {
    public static void main(String[] args) {
       String text;
        
       Scanner in = new Scanner (System.in);
       System.out.print("\nMasukkan Kalimat : ");
       text = in.nextLine();
       String str1 = text.toUpperCase();
       String str2 = text.toLowerCase();
       System.out.println("\n===Hasil Formating===");
       System.out.println("Huruf Besar : " + str1);
       System.out.println("Hurud Kecil : " + str2);
    }
    
}
