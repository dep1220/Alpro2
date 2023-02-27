package tugas_alpro_2_modul_1;
import java.util.Scanner;

public class Tugas2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\033[H\033[2J");
    String nama;
    int totalGajih = 0, tunjangan = 0, pajak, gajihPokok = 0, pilihan;

    System.out.print("Nama : ");
    nama = input.nextLine();

    System.out.println("==============================");
    System.out.println("======= PILIH GOLONGAN =======");
    System.out.println("==============================");
    System.out.println("1. Golongan 1");
    System.out.println("2. Golongan 2");
    System.out.println("3. Golongan 3");
    System.out.print("Pilihan : ");
    pilihan = input.nextInt();

    switch(pilihan) {
      case 1:
      gajihPokok = 10_000_000;
      tunjangan = 5_000_000;
      break;
      case 2:
      gajihPokok = 7_000_000;
      tunjangan = 3_000_000;
      break;
      case 3:
      gajihPokok = 5_000_000;
      tunjangan = 1_000_000;
      break;
      default:
      System.out.println("Inputan yang anda masukkan tidak ada..");
    }

    System.out.println("\033[H\033[2J");
    pajak = (5* (tunjangan + gajihPokok))/100;
    totalGajih = (tunjangan + gajihPokok) - pajak;

    System.out.println("=============================");
    System.out.println("======= GAJIH BERSIH ========");
    System.out.println("=============================");
    System.out.println("Nama         : " + nama);
    System.out.println("Tunjangan    : " + tunjangan);
    System.out.println("Pajak        : " + pajak);
    System.out.println("Gajih pokok  : " + gajihPokok);
    System.out.println("Gajih bersih : " + totalGajih);

    input.close();
  }
}
