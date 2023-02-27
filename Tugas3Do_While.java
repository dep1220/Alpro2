package tugas_alpro_2_modul_1;

public class Tugas3Do_While {
  public static void main(String[] args) {
    System.out.println("\033[H\033[2J");
    int jumlahPengulanga = 15;
    int nilaiAwal = 0;
    System.out.println("============================");
    System.out.println("=== PENGULANGAN DO-WHILE ===");
    System.out.println("============================");

    do {
      System.out.println("Pengulangan ke-" + (nilaiAwal + 1));
      nilaiAwal++;
    } while(nilaiAwal < jumlahPengulanga);
  }
}
