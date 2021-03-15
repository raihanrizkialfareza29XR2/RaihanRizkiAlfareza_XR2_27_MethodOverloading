package MyOverloading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // Membuat class main
        boolean running = true; // deklarasi boolean untuk perulangan while
        String pilihan; // String pilihan untuk memasukkan pilihan Y/T di akhir program
        while(running){ // Perulangan while untuk pilihan Y/T di akhir program
            InfoPanel infoPanel = new InfoPanel(); // membuat objek baru
            BangunDatar bangunDatar = new BangunDatar();
            BangunDatar2 bangunDatar2 = new BangunDatar2();
            BangunDatar3 bangunDatar3 = new BangunDatar3();
            infoPanel.Info(); // Memanggil method Info
            infoPanel.Pilihan(); // Memanggil method pilihan
            if (infoPanel.pilihan == 1){ // menggunakan percabangan if untuk menentukan program yang dieksekusi
                                         // sesuai dengan input pilihan user
                bangunDatar.Bangun();
                bangunDatar.Inputan();
                bangunDatar.Keliling(bangunDatar.a, bangunDatar.b);
                bangunDatar.Luas(bangunDatar.d1, bangunDatar.d2);
            } else if (infoPanel.pilihan == 2){
                bangunDatar2.Bangun();
                bangunDatar2.Inputan();
                bangunDatar2.Keliling(bangunDatar2.panjang, bangunDatar2.lebar);
                bangunDatar2.Luas(bangunDatar2.panjang, bangunDatar2.lebar);
            } else if (infoPanel.pilihan == 3){
                bangunDatar3.Bangun();
                bangunDatar3.Inputan();
                bangunDatar3.Keliling(bangunDatar3.alas, bangunDatar3.siring);
                bangunDatar3.Luas(bangunDatar3.alas, bangunDatar3.tinggi);
            }
            System.out.println("");
            System.out.print("|Apakah Anda Ingin Mengulang? (Y/T) : ");
            Scanner input = new Scanner(System.in);
            pilihan = input.nextLine();
            if(pilihan.equalsIgnoreCase("T")){ // Jika user memasukkan T, maka program akan berhenti dan selesai.
                                                          // Jika user memasukkan Y, maka program akan mulai dari awal.
                running = false;
            }
        }
    }
}
