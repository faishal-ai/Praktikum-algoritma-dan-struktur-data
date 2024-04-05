import SequentalSearch.Buku09;

public class Buku09Main {
    public static void main(String[] args) {
        
        Buku09 bk1 = new Buku09();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stock = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.hargaTotal=bk1.hitungHargaTotal();
        bk1.diskon=bk1.hitungDiskon();
        bk1.hitungHargaBayar();
        bk1.tampilInformasi();

        Buku09 bk2 = new Buku09("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.hargaTotal=bk2.hitungHargaTotal();
        bk2.diskon=bk2.hitungDiskon();
        bk2.hitungHargaBayar();
        bk2.tampilInformasi();

        Buku09 bukuFaishal = new Buku09("Emotion Control", "Faishal Harist Rahmawan", 112, 98, 123456);
        bukuFaishal.terjual(11);
        bukuFaishal.hargaTotal=bukuFaishal.hitungHargaTotal();
        bukuFaishal.diskon=bukuFaishal.hitungDiskon();
        bukuFaishal.hitungHargaBayar();
        bukuFaishal.tampilInformasi();
    } 
}