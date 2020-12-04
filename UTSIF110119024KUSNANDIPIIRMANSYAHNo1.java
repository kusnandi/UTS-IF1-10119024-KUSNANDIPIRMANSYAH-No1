/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119024.kusnandipiirmansyah.no1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA  : KUSNANDI PIRMANSYAH
 * KELAS : IF1
 * NIM   : 10119024
 */
public class UTSIF110119024KUSNANDIPIIRMANSYAHNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Date date = new Date();
        TandanyaKamu age = new TandanyaKamu(date.getYear());
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scan.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya Kamu "+age.tandanyaKamu(age.hitungUmur()));
    }
}