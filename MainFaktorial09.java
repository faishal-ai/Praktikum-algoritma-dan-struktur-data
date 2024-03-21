import java.util.Scanner;


public class MainFaktorial09 {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
            System.out.println("====================================");
            System.out.print("Masuka Jumlah Element : ");
            int iJml = sc.nextInt();

            Faktorial09 [] fk = new Faktorial09 [10];
            for (int i = 0; i < iJml; i++) {
                fk[i] = new Faktorial09();
                System.out.println("Masukan nilai element ke-" + (i + 1));
                fk[i].nilai = sc.nextInt();
            }
            System.out.println("====================================");
            System.out.println("Hasil Faktorial dengan Brute Force");
            for (int i = 0; i < iJml; i++) {
                System.out.println("Hasil Penghitungan Faktorial Menggunakan Brute Force Adalah =" + fk[i].faktorialBF(fk[i].nilai));
            }
            System.out.println("====================================");
            System.out.println("Hasil Faktorial dengan Divide and Conquer");
            for (int i = 0; i < iJml; i++) {
                System.out.println("Hasil Penghitungan Faktorial Menggunakan Divide and Conquer Adalah =" + fk[i].faktorialDC(fk[i].nilai));
}
        }
}
}