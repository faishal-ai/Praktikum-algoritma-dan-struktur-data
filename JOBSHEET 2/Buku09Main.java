public class Buku09Main {
    public static void main(String[] args) {
        
        Buku09 bk1 = new Buku09();
        bk1.judul = " Today Ends Tomorrow Comes";
        bk1.pengarang = " Denda Pertiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilinformasi();
        bk1.terjual(5);
        bk1.gantiHarga(6000);
        bk1.tampilinformasi();

    }
}
