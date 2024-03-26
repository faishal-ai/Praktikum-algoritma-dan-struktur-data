import JOBSHEET5.Hotel09;

public class MainHotel09 {
    public static void main(String[] args) {

        HotelService09 list = new HotelService09();
        Hotel09 h1 = new Hotel09("Oyo", "Malang", 25000, (byte) 3);
        Hotel09 h2 = new Hotel09("Airi", "Surabaya", 10000, (byte) 4);
        Hotel09 h3 = new Hotel09("Santika", "Jakarta", 19000, (byte) 5);
        Hotel09 h4 = new Hotel09("RedDoorz", "Jember", 23000, (byte) 2);
        Hotel09 h5 = new Hotel09("Mercure", "Bogor", 21000, (byte) 3);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data Hotel sebelum di sorting: ");
        list.tampilAll();

        System.out.println("Data harga hotel asc bubble sort: ");
        list.bubbleSortHrg();
        list.tampilAll();

        System.out.println("Data rating hotel desc bubble sort: ");
        list.bubbleSortRtg();
        list.tampilAll();

        System.out.println("Data harga hotel asc selection sort: ");
        list.selectionSortHrg();
        list.tampilAll();

        System.out.println("Data rating hotel desc selection sort: ");
        list.selectionSortRtg();
        list.tampilAll();
    }
    
}
