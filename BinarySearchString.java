import java.util.Arrays;

public class BinarySearchString {
    public static void main(String[] args) {
        String[] nama = {"Andi", "Budi", "Cindy", "Doni", "Eka"};
        Arrays.sort(nama);

        String cari = "Doni";
        int low = 0, high = nama.length - 1;
        int mid, hasil = -1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (nama[mid].equalsIgnoreCase(cari)) {
                hasil = mid;
                break;
            } else if (nama[mid].compareToIgnoreCase(cari) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Nama yang dicari: " + cari);
        if (hasil != -1) {
            System.out.println("Indeks ditemukan: " + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
