package JOBSHEET7;

import java.util.Scanner;
public class Utama09{
    public static void main(String[] args) {
        Gudang09 gudang = new Gudang09(7);
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah barang");
                System.out.println("2. Ambil barang");
                System.out.println("3. Tampilkan tumpukan barang");
                System.out.println("4. Lihat barang terbawah");
                System.out.println("5. Cari barang");
                System.out.println("6. Keluar");
                System.out.print("Pilih operasi: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();
                switch (pilihan) {
           
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang09 barangBaru = new Barang09(kode, nama, 
                    kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                    
                case 2:
                    gudang.ambilBarang();
                    break;
                    
                case 3:
                    gudang.tampilkanBarang();
                    break;
                          
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                    case 5:
                    System.out.print("Masukkan kode barang yang ingin dicari: ");
                    String kodeAtauNama = scanner.nextLine();
                    Barang09 barangDitemukan = gudang.cariBarang(kodeAtauNama);
                    if (barangDitemukan != null) {
                        System.out.println("Barang ditemukan: " + barangDitemukan.nama);
                    } else {
                        System.out.println("Barang dengan kode atau nama tersebut tidak ditemukan.");
                    }
                    break;
                
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            }
        }
        }
        
}