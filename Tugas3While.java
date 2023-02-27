package tugas_alpro_2_modul_1;

public class Tugas3While {
  public static void main(String[] args) {
    System.out.println("\033[H\033[2J");
    int jumlahPengulanga = 15;
    int nilaiAwal = 0;
    System.out.println("=======================");
    System.out.println("== PENGULANGAN WHILE ==");
    System.out.println("=======================");

    while(nilaiAwal < jumlahPengulanga){
      System.out.println("Pengulanga ke-" + (nilaiAwal+1));
      nilaiAwal++;
    }
    
  }
}
