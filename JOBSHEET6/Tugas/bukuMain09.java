package Tugas;

import java.util.Scanner;
    public class bukuMain09{
        public static void main(String[] args) {
            try (Scanner s1 = new Scanner(System.in)) {
                try (Scanner s2 = new Scanner(System.in)) {
                    PencarianBuku09 data = new PencarianBuku09();
                    int jumBuku = 5;
   
                    System.out.println("---------------------------");
                    System.out.println("Masukan Data Buku Secara Urut dari KodeBuku Terkecil : ");
                    for (int i = 0; i < jumBuku; i++) {
                        System.out.println("-----------------------");
                        System.out.print("Kode Buku \t : ");
                        String kodeBuku = s1.next();
                        System.out.print("Judul Buku \t : ");
                        String judulBuku = s2.nextLine();
                        System.out.print("Tahun Terbit \t : ");
                        int tahunTerbit = s1.nextInt();
                        System.out.print("Pengarang \t : ");
                        String pengarang = s2.nextLine();
                        System.out.print("Stok \t\t : ");
                        int stok = s1.nextInt();
   
                        s1.nextLine();
                        
   
                        Buku09 m = new Buku09 (kodeBuku, judulBuku, tahunTerbit,pengarang, stok);
                        data.tambah(m);
                    }
                    System.out.println("----------------------");
                    System.out.println("----------------------");
                    System.out.println("Pencarian Data : ");
                    System.out.println("Masukan Judul Buku yang ingin dicari : ");
                    String cari = s1.nextLine();
                    System.out.println("==========================");
                    System.out.println("Menggunakan Sequential Search");
                    int posisi = data.FindJudSeqSearch(cari);
                    data.Tampilposisi(cari, posisi);
                    System.out.println("=========================");
                    System.out.println("Menggunakan Binary Search");
                    data.Sorting();
                    posisi = data.FindJudBinary(cari, 0, jumBuku - 1);
                    data.Tampilposisi(cari, posisi);
                }
            }
        }   
}
