package JOBSHEET3;

public class Mahasiswa9 {
    public static final double IPK = 0;
    private String nama;
    private String nim;

    // Konstruktor 1
    public Mahasiswa9() {
        this.nama = "Belum ditentukan";
        this.nim = "Belum ditentukan";
    }

    // Konstruktor 2s
    public Mahasiswa9(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor pertama
        Mahasiswa9 mhs1 = new Mahasiswa9();
        System.out.println("Informasi Mahasiswa 1:");
        mhs1.tampilkanInfo();
        
        // Membuat objek menggunakan konstruktor kedua
        Mahasiswa9 mhs2 = new Mahasiswa9("Faishal Harist", "2341720218");
        System.out.println("\nInformasi Mahasiswa 2:");
        mhs2.tampilkanInfo();
    }
}

