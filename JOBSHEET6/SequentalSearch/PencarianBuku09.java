package SequentalSearch;
public class PencarianBuku09 {  
    Buku09 listBk[] = new Buku09[5];
    int idx;
    
    void tambah(Buku09 m){
        if (idx < listBk.length){
        listBk[idx] = m;
        idx++;

    }else {
        System.out.println("Data sudah penuh!");
        }
    }
    
    void tampil() {
    for (Buku09 m : listBk){
    m.tampilDataBuku();
        }
    }
    
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++){
        if (listBk[j].kodeBuku==cari){
            posisi = j;
            break;
        }
    }
    return posisi;
    }
    
    public void Tampilposisi(int x, int pos){
        if (pos != -1){
        System.out.println("data : "+ x + " ditemukan pada indeks " + pos);

    }else{
        System.out.println("data "+ x + " tidak ditemukan");
    }
    }
    
    public void TampilData(int x, int pos){
        if(pos!= -1){
        System.out.println("Kode Buku\t : " + x );
        System.out.println("Judul\t : " +listBk[pos].judulBuku);
        System.out.println("Tahun Terbit\t : " +listBk[pos].tahunTerbit);
        System.out.println("Pengarang\t : " +listBk[pos].pengarang);
        System.out.println("Stock\t : " + listBk[pos].stock);
    } else {
        System.out.println("Data " + x + "tidak ditemukan");
            }
            public Buku09 FindBuku(int cari) {
                    Buku09 bukuFound = null;
                for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].kodeBuku == cari) {
                return listBk[j];
                     }
                }
                return bukuFound;
            }
    }
}