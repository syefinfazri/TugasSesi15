import java.util.Arrays;

public class BinarySearchAngka {
    public static void main(String[] args) {
        int[] data = {34, 7, 23, 32, 5, 62};
        Arrays.sort(data);

        int cari = 23;
        int low = 0;
        int high = data.length - 1;
        int mid;
        int langkah = 0;
        int hasil = -1;

        while (low <= high) {
            langkah++;
            mid = (low + high) / 2;

            if (data[mid] == cari) {
                hasil = mid;
                break;
            } else if (data[mid] < cari) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Nilai yang dicari: " + cari);
        if (hasil != -1) {
            System.out.println("Hasil pencarian (indeks): " + hasil);
            System.out.println("Status: Ditemukan");
        } else {
            System.out.println("Status: Tidak ditemukan");
        }
        System.out.println("Jumlah langkah: " + langkah);
    }
}
