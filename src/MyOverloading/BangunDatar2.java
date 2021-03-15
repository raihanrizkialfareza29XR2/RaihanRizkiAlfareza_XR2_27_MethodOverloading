package MyOverloading;

import java.util.Scanner; // Agar dapat membuat scanner baru nantinya

public class BangunDatar2 extends BangunDatar { // Class untuk yang menampung method2 penghitungan luas dan keliling persegi panjang
    int panjang, lebar; // Deklarasi variabel sebagai tempat user memasukkan nilai
    String bangun = "Persegi Panjang"; // Nama bangun

    public void Keliling(int panjang, int lebar){ // Membuat method void berisikan parameter int panjang dan int lebar untuk kemudian diberi nilai
        this.panjang = panjang; // Menggunakan kata kunci this untuk mengisi variabel int panjang
        this.lebar = lebar; // Menggunakan kata kunci this untuk mengisi variabel int lebar
        double k = (2*panjang)+(2*lebar); // Memasukkan rumus keliling
        System.out.println("");
        System.out.println("|Rumus Keliling Persegi Panjang : (2 x panjang) + (2 x lebar)");
        System.out.println("|Cara Penyelesasian             : 2 x " + panjang + " + 2 x " + lebar);
        System.out.println("|Hasil                          : " + k);
    }
    public void Luas(int panjang, int lebar){ // Membuat method void berisikan parameter int panjang dan int lebar untuk kemudian diberi nilai
        this.panjang = panjang; // Menggunakan kata kunci this untuk mengisi variabel int panjang
        this.lebar = lebar; // Menggunakan kata kunci this untuk mengisi variabel int lebar
        double l = panjang*lebar; // Memasukkan rumus luas
        System.out.println("");
        System.out.println("|Rumus Luas Persegi             : Panjang x Lebar");
        System.out.println("|Cara Penyelesasian             : " + panjang + " x " + lebar);
        System.out.println("|Hasil                          : " + l);
    }
    String Bangun (){ // Deklarasi nama bangun menggunakan method non-void
        System.out.println("");
        System.out.println("|Bangun : " + bangun);
        return bangun; // Mengembalikan nilai bangun
    }
    public void Inputan(){ // Method void untuk menyimpan input user
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("|Silakan Masukkan Nilai Panjang Persegi Panjang yang Hendak Dihitung : ");
        panjang = input.nextInt();
        System.out.print("|Silakan Masukkan Nilai Lebar Persegi Panjang yang Hendak Dihitung   : ");
        lebar = input.nextInt();
    }
}
