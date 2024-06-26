package JOBSHEET7;

public class Gudang09 {
    Barang09[] tumpukan;
    int size;
    int top;
    
public Gudang09(int kapasitas) {
    size = kapasitas;
    tumpukan = new Barang09[size];
    top = -1;
}
public boolean cekKosong() {
return top == -1;
}
public boolean cekPenuh() {
return top == size - 1;
}
public void tambahBarang(Barang09 brg) {
    if (!cekPenuh()) {
    top++;
    tumpukan[top] = brg;
    System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
} else {
    System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
}
}
public Barang09 ambilBarang() {
    if (!cekKosong()) {
    Barang09 delete = tumpukan[top];
    top--;
    System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
    System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
    return delete;
} else {
    System.out.println("Tumpukan barang kosong.");
return null;

}
}
public Barang09 lihatBarangTeratas() {
    if (!cekKosong()) {
    Barang09 barangTeratas = tumpukan[top];
    System.out.println("Barang teratas: " +barangTeratas.nama);
    return barangTeratas;
} else {
    System.out.println("Tumpukan barang kosong.");
return null;
}
}
public void tampilkanBarang() {
    if (!cekKosong()) {
    System.out.println("Rincian tumpukan barang di Gudang: ");
    for (int i = top; i >= 0; i--) {
    System.out.printf("Kode %d: %s (Kategori %s)\n", 
    tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
}
} else {
    System.out.println("Tumpukan barang kosong.");
    }
}
public String konversiDesimalKeBiner(int kode) {
    StackKonversi09 stack = new StackKonversi09();
    while (kode > 0) {
        int sisa = kode % 2;
        stack.push(sisa);
        kode = kode / 2;
    }
    String biner = new String();
    while (!stack.isEmpty()) {
        biner += stack.pop();
    }
    return biner;
    }
    public Barang09 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang09 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public boolean cariBarang(int kode) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == kode) {
                    System.out.println("Barang dengan kode " + kode + " ditemukan: " + tumpukan[i].nama);
                    return true;
                }
            }
            System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
            return false;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return false;
        }
    }

    public Barang09 cariBarang(String kodeAtauNama) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == Integer.parseInt(kodeAtauNama)) {
                return tumpukan[i];
            }
            if (tumpukan[i].nama.equals(kodeAtauNama)) {
                return tumpukan[i];
            }
        }
        return null; 
    }
    
}
