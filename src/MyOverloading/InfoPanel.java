package MyOverloading;

import java.util.Scanner;

public class InfoPanel { // Class InfoPanel untuk menampung method info dan pilihan
    int pilihan; // Deklarasi variabel pilihan untuk memilih program
    public void Info(){ // Method info untuk menampilkan pilihan program
        System.out.println("");
        System.out.println("|=================================================|");
        System.out.println("|Program Menghitung Luas dan Keliling Bangun Datar|");
        System.out.println("|_________________________________________________|");
        System.out.println("|     1. Menghitung Luas dan Keliling Layang2     |");
        System.out.println("| 2. Menghitung luas dan keliling Persegi Panjang |");
        System.out.println("|    3. Menghitung Luas dan Keliling Segitiga     |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("");
    }
    int Pilihan(){ // Method non void pilihan untuk menyimpan pilihan user
        System.out.print("|Silakan Masukkan Nomor Pilihan Anda : ");
        Scanner input = new Scanner(System.in);
        pilihan = input.nextInt();
        return pilihan;
    }
}
