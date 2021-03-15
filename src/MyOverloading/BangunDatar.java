package MyOverloading;

import java.util.Scanner; // Agar dapat membuat scanner baru nantinya

public class BangunDatar { // Class untuk yang menampung method2 penghitungan luas dan keliling layang2
    int a, b, d1, d2; // Deklarasi variabel sebagai tempat user memasukkan nilai
    String bangun = "Layang Layang"; // Nama bangun

    public void Keliling(int a, int b){ // Membuat method void berisikan parameter int a dan int b untuk kemudian diberi nilai
        this.a = a; // Menggunakan kata kunci this untuk mengisi variabel int a
        this.b = b; // Menggunakan kata kunci this untuk mengisi variabel int b
        double k = (a+b)*2; // Memasukkan rumus keliling
        System.out.println("");
        System.out.println("|Rumus Keliling Persegi : (Sisi a + Sisi b) x 2");
        System.out.println("|Cara Penyelesasian     : (" + a + " + " + b + ") x 2");
        System.out.println("|Hasil                  : " + k);
    }
    public void Luas(int d1, int d2){ // Membuat method void berisikan parameter int d1 dan int d2 untuk kemudian diberi nilai
        this.d1 = d1; // Menggunakan kata kunci this untuk mengisi variabel int d1
        this.d2 = d2; // Menggunakan kata kunci this untuk mengisi variabel int d2
        double l = (d1*d2)/2; // Memasukkan rumus luas
        System.out.println("");
        System.out.println("|Rumus Luas Persegi     : (Diagonal 1 x Diagonal 2) / 2");
        System.out.println("|Cara Penyelesasian     : (" + d1 + " x " + d2 + ") / 2");
        System.out.println("|Hasil                  : " + l);
    }
    String Bangun (){ // Deklarasi nama bangun menggunakan method non-void
        System.out.println("");
        System.out.println("|Bangun : " + bangun);
        return bangun; // Mengembalikan nilai bangun
    }
    public void Inputan(){ // Method void untuk menyimpan input user
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("|Silakan Masukkan Nilai Panjang Diagonal 1 Layang2 yang Hendak Dihitung            : ");
        d1 = input.nextInt();
        System.out.print("|Silakan Masukkan Nilai Panjang Diagonal 2 Layang2 yang Hendak Dihitung            : ");
        d2 = input.nextInt();
        System.out.print("|Silakan Masukkan Nilai Panjang Salah Satu Sisi Atas Layang2 yang Hendak Dihitung  : ");
        a = input.nextInt();
        System.out.print("|Silakan Masukkan Nilai Panjang Salah Satu Sisi Bawah Layang2 yang Hendak Dihitung : ");
        b = input.nextInt();
    }
}
