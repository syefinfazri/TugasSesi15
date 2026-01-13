public class BinarySearchNilaiMahasiswa {
    public static void main(String[] args) {
        int[] nilai = {60, 70, 75, 80, 85, 90, 95};
        int cari = 85;

        int low = 0, high = nilai.length - 1;
        int mid, langkah = 0;
        int hasil = -1;

        while (low <= high) {
            langkah++;
            mid = (low + high) / 2;

            if (nilai[mid] == cari) {
                hasil = mid;
                break;
            } else if (nilai[mid] < cari) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Nilai dicari: " + cari);
        if (hasil != -1) {
            System.out.println("Indeks ditemukan: " + hasil);
            System.out.println("Status: Ditemukan");
        } else {
            System.out.println("Status: Tidak ditemukan");
        }
        System.out.println("Jumlah langkah pencarian: " + langkah);
    }
}