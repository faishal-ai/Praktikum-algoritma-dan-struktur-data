import java.util.Scanner;
public class MainPangkat09 {
public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("==================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

      Pangkat09[] png = new Pangkat09[elemen]; 
        for (int i = 0; i < elemen; i++) {
        System.out.print("Masukkan nilai yang hendak dipangkatkan:");
        int nilai = sc.nextInt(); 
        System.out.print("Masukkan nilai pemangkat:");
        int pangkat = sc.nextInt(); 
        png[i] = new Pangkat09(nilai, pangkat);
 }
 System.out.println("=============================================================");
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
          for (int i = 0; i < elemen; i++) {
          System.out.println("Hasil dari " + png[i].nilai + " pangkat "
          + png[i].pangkat + " adalah "
          + png[i].pangkatBF(png[i].nilai, png[i].pangkat)); 
 }
        System.out.println("Pilih method yang ingin dijalankan:");
        System.out.println("1. Pangkat Brute Force");
        System.out.println("2. Pangkat Divide and Conquer");
          int pilihan = sc.nextInt();
          switch (pilihan) {

        case 1:
          System.out.println("HASIL PANGKAT - BRUTE FORCE");
          for (int i = 0; i < elemen; i++) {
          System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat)); 
}
      break;
        case 2:
          System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
          for (int i = 0; i < elemen; i++) {
          System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat)); 
}
        break;
          default:
          System.out.println("Pilihan tidak valid");
        break;
//  System.out.println("=============================================================");
//         System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
//           for (int i = 0; i < elemen; i++) {
//           System.out.println("Hasil dari " + png[i].nilai + " pangkat "
//           + png[i].pangkat + " adalah "
//           + png[i].pangkatDC(png[i].nilai, png[i].pangkat)); 
//             }
      }
      }
  }
}