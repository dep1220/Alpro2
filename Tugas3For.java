package tugas_alpro_2_modul_1;

public class Tugas3For {
  public static void main(String[] args) {
    System.out.println("\033[H\033[2J");
    int jumlahPengulanga = 15;
    System.out.println("======================");
    System.out.println("=== PERULANGAN FOR ===");
    System.out.println("======================");

    for(int i = 0; i < jumlahPengulanga; i++){
      System.out.println("Pengulangan ke-" + (i+1));
    }
  }
}
