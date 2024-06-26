package SequentalSearch;
import java.util.Scanner;
public class BukuMain09 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            try (Scanner s1 = new Scanner(System.in)) {
                PencarianBuku09 data = new PencarianBuku09();
                int jumBuku = 5;
                System.out.println("================================================");
                System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");

for (int i = 0; i < jumBuku; i++) {
   System.out.println("========================");
   System.out.print("Kode Buku \t: ");
   int kodeBuku = s.nextInt();
   System.out.print("Judul buku \t: ");
   String judulBuku = s1.nextLine();
   System.out.print("Tahun terbit \t: ");
   int tahunTerbit = s.nextInt();
   System.out.print("Pengarang \t: ");
   String pengarang = s1.nextLine();
   System.out.print("Stock \t: ");
   int stock = s.nextInt();
   Buku09 m = new Buku09(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
    data.tambah(m);
}
System.out.println("================================================");
System.out.println("Data keseluruhan Mahasiswa : ");
System.out.println("================================================");
System.out.println("Data keseluruhan Buku : ");
data.tampil();
System.out.println("------------------------------------------------------------------------- ");
System.out.println("-------------------------------------------------------------------------");
System.out.println("Pencarian Data : ");
System.out.println("Masukkan Kode Buku yang dicari: ");
System.out.print("Kode Buku : ");
int cari = s.nextInt();
System.out.println("Menggunakan sequential Search");
int posisi = data.FindSeqSearch(cari);
data.Tampilposisi(cari, posisi);
data.TampilData(cari, posisi);

Buku09 dataBuku = data.FindBuku(cari);
dataBuku.tampilDataBuku();
s.close();
s1.close();
            }
        }
}
}
