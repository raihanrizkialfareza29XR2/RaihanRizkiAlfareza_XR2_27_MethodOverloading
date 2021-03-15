package MyOverloading;

import java.util.Scanner; // Agar dapat membuat scanner baru nantinya

public class BangunDatar3 extends BangunDatar{ // Class untuk yang menampung method2 penghitungan luas dan keliling segitiga
    int alas, siring, tinggi; // Deklarasi variabel sebagai tempat user memasukkan nilai
    String bangun = "Segitiga"; // Nama bangun

    public void Keliling(int alas, int siring){ // Membuat method void berisikan parameter int alas dan int siring untuk kemudian diberi nilai
        this.alas = alas; // Menggunakan kata kunci this untuk mengisi variabel int alas
        this.siring = siring; // Menggunakan kata kunci this untuk mengisi variabel int siring
        double k = alas + (siring*2); // Memasukkan rumus keliling
        System.out.println("");
        System.out.println("|Rumus Keliling Segitiga : alas + (2 x Sisi Miring)");
        System.out.println("|Cara Penyelesasian      : " + alas + " + (" + siring + " x 2)");
        System.out.println("|Hasil                   : " + k);
    }
    public void Luas(int alas, int tinggi){ // Membuat method void berisikan parameter int alas dan int tinggi untuk kemudian diberi nilai
        this.alas = alas; // Menggunakan kata kunci this untuk mengisi variabel int alas
        this.tinggi = tinggi; // Menggunakan kata kunci this untuk mengisi variabel int tinggi
        double l = (alas*tinggi)/2; // Memasukkan rumus luas
        System.out.println("");
        System.out.println("|Rumus Luas Segitiga     : (Alas x Tinggi) : 2");
        System.out.println("|Cara Penyelesasian      : " + alas + " x " + tinggi + " : 2");
        System.out.println("|Hasil                   : " + l);
    }
    String Bangun (){ // Deklarasi nama bangun menggunakan method non-void
        System.out.println("");
        System.out.println("|Bangun : " + bangun);
        return bangun; // Mengembalikan nilai bangun
    }
    public void Inputan(){ // Method void untuk menyimpan input user
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("|Silakan Masukkan Nilai Alas Segitiga yang Hendak Dihitung        : ");
        alas = input.nextInt();
        System.out.print("|Silakan Masukkan Nilai Tinggi Segitiga yang Hendak Dihitung      : ");
        tinggi = input.nextInt();
        System.out.print("|Silakan Masukkan Nilai Sisi Miring Segitiga yang Hendak Dihitung : ");
        siring = input.nextInt();
    }
}
