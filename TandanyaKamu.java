/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119024.kusnandipiirmansyah.no1;

/**
 *
 * @author acer
 * NAMA : KUSNANDI PIRMANSYAH
 * KELAS : IF1
 * NIM   : 10119024
 */
public class TandanyaKamu {
    private int yearBirth;
    private int yearNow;
    private static String red = "\033[38;2;255;0;0m";

    public TandanyaKamu(int yearNow){
        this.yearNow = yearNow + 1900;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur(){
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur){
        String keterangan = "";
        if(0 <= umur && umur <= 5){
            keterangan = "LAGI LUCU-LUCU NYA";
        }else if(5 < umur && umur <= 10){
            keterangan = "MASIH ANAK-ANAK";
        }else if(10 < umur && umur <= 13){
            keterangan = "MASIH REMAJA";
        }else if(13 < umur && umur <= 19){
            keterangan = "ALAY";
        }else if(19 < umur && umur <= 29){
            keterangan = "LAGI GALAU NYARI JODOH";
        }else if(29 < umur && umur <= 35){
            keterangan = "LAGI SIBUK NYARI UANG";
        }else if(35 < umur && umur <= 150){
            keterangan = "SUDAH TUA";
        }else if(0 > umur && umur > 150){
            keterangan = "TIDAK TERDEKSI DI KEHIDUPAN";
        }
        return keterangan;
    }
    
}
