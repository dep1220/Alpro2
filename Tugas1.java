package tugas_alpro_2_modul_1;
import java.util.Scanner;
import java.io.IOException;

public class Tugas1 {
  public static void main(String[] args)throws IOException, InterruptedException {
    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    Scanner input = new Scanner(System.in);
    // todo deklarasi variaabel
    int jumlahAngka;
    double rataRataNilai = 0;

    System.out.print("Masukkan Jumlah Nilai yang akan di hitung : ");
    jumlahAngka = input.nextInt();
    for(int nilaiAwal = 0 ; nilaiAwal < jumlahAngka ; nilaiAwal++) {
      System.out.print("Nilai ke - " + (nilaiAwal + 1) + ": ");
      rataRataNilai += input.nextInt();
    }


    rataRataNilai /= jumlahAngka;
    System.out.println("Rata - rata Nilai = " + rataRataNilai);
    input.close();
  }
  
}
