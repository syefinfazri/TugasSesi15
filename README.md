# Tugas Praktikum Sesi 15 – Binary Search

* **Nama:** Syefin Fazri Nugraha
* **NIM:** 2021004009
* **Kelas:** TI25F
* **Mata Kuliah:** Algoritma dan Struktur Data
* **Dosen Pengampu:** Shinta Ayuningtias, S.Kom., M.Kom

---

## Penjelasan Singkat

Praktikum ini bertujuan untuk memahami konsep dan implementasi algoritma Binary Search pada data terurut. Mahasiswa mempelajari proses pencarian data numerik dan string, menganalisis langkah pencarian, serta membandingkan efisiensi Binary Search dengan Linear Search.

---

## Aktivitas 1 – Persiapan Data Terurut

**Data sebelum sorting:**
34, 7, 23, 32, 5, 62

**Data sesudah sorting:**
5, 7, 23, 32, 34, 62

**Kesimpulan:**
Binary Search hanya dapat bekerja dengan benar jika data berada dalam kondisi **terurut**. Proses sorting menjadi tahap awal yang wajib dilakukan sebelum pencarian.

---

## Aktivitas 2 – Binary Search Data Angka

**Data:** 5, 7, 23, 32, 34, 62
* **Data yang dicari:** 23

**Hasil:**

* Status: Ditemukan
* Indeks ditemukan: 2

**Kesimpulan:**
Binary Search membagi ruang pencarian menjadi dua bagian pada setiap iterasi, sehingga pencarian menjadi lebih cepat dibandingkan pencarian linear.

---

## Aktivitas 3 – Analisis Langkah Pencarian

**Langkah 1**
* Low = 0
* High = 5
* Mid = (0 + 5) / 2 = 2
* Data[mid] = 23
Karena nilai pada indeks tengah sama dengan nilai yang dicari, maka data ditemukan.

**Langkah 2**
* Tidak dilakukan
Karena data sudah ditemukan pada langkah pertama, proses pencarian langsung dihentikan.

**Langkah 3**
* Tidak dilakukan
Binary Search berhenti ketika data ditemukan.

**Kesimpulan Jumlah Langkah**

Jumlah langkah pencarian yang dibutuhkan adalah 1 langkah artinya jumlah langkah pencarian Binary Search jauh lebih sedikit dibandingkan Linear Search, terutama pada jumlah data yang besar.

---

## Aktivitas 4 – Binary Search Data String

**Data sebelum sorting:**
Andi, Budi, Cindy, Doni, Eka

**Data sesudah sorting:**
Andi, Budi, Cindy, Doni, Eka

**Metode perbandingan:**
`compareToIgnoreCase()`

**Kesimpulan:**
Penggunaan `compareToIgnoreCase()` memungkinkan pencarian data string tanpa membedakan huruf besar dan kecil, sehingga pencarian menjadi lebih fleksibel.

---

## Aktivitas 5 – Mini Project Binary Search

Mini project mengimplementasikan Binary Search untuk mencari nilai mahasiswa.

**File Java:**
`BinarySearchNilaiMahasiswa.java`

**Fitur Program:**

* Pencarian nilai mahasiswa
* Menampilkan indeks hasil pencarian
* Menampilkan jumlah langkah pencarian

**Output Program:**
Menampilkan status pencarian (ditemukan/tidak ditemukan) serta jumlah iterasi yang dilakukan.

---

## Kesimpulan

Binary Search merupakan algoritma pencarian yang efisien dengan kompleksitas waktu **O(log n)**. Algoritma ini sangat efektif untuk data berukuran besar, namun memiliki syarat utama yaitu **data harus dalam keadaan terurut**. Oleh karena itu, Binary Search lebih unggul dibandingkan Linear Search dalam hal efisiensi waktu.
