public class Buku09 {

    String judul, pengarang;
    int halaman, stok, harga;
    public Buku09() {

}
public Buku09(String jud, String pg, int hal, int stok, int harga ){
    judul = jud;
    pengarang = pg;
    halaman = hal;
    this.stok = stok;
    this.harga = harga;

}
    
    void tampilinformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }


 void terjual(int jml){
        stok -= jml;
}   
   
void restock(int jml){
    stok += jml;
}
void gantiHarga(int hrg){
    harga = hrg;
}

   


}


