# MiniProject

## 📚 Program Data Mahasiswa (Java OOP)

Program konsol berbasis Java yang mengimplementasikan konsep Control Flow dan Object-Oriented Programming (OOP) untuk mengelola data mahasiswa, melakukan validasi input, serta menentukan status kelulusan.

## 📌 Deskripsi Proyek

Proyek ini dibuat untuk memenuhi tugas mata kuliah Pemrogaraman Berorientasi Objek (PBO) pada Pertemuan 3 & 4. Program ini menerima input data beberapa mahasiswa secara dinamis, melakukan validasi agar NIM unik dan nilai berada di rentang valid, lalu menampilkan rekapitulasi hasilnya.

## 🚀 Fitur Utama

- Pengelolaan Objek Mahasiswa: Menggunakan class Mahasiswa dengan atribut nama, NIM, dan nilai.
- Validasi NIM Unik: Memastikan tidak ada dua mahasiswa yang memiliki NIM sama.
- Validasi Nilai: Memastikan input nilai berada dalam rentang 0 sampai 100.
- Penentuan Kelulusan: Mengecek kelulusan secara otomatis berdasarkan standar nilai ($\ge 60$).
- Input & Output Dinamis: Memanfaatkan Scanner dan perulangan (loop) untuk pengolahan data berulang.

## 🛠️ Komponen Java yang Digunakan

- class & object
- variable & data type
- Scanner (Input Processing)
- if / else (Decision Making & Validasi)
- loop (for & while)
- method (tampilkanData() & cekKelulusan())

## ⚙️ Cara Menjalankan Program

### Prasyarat

Pastikan **JDK 8 atau lebih baru** sudah terpasang. Cek dengan:

```bash
java -version
javac -version
```

### Langkah-langkah

1. **Clone atau unduh** repositori ini, lalu buka foldernya di terminal.

2. **Compile** program:

   ```bash
   javac miniProject.java
   ```

3. **Jalankan** program:

   ```bash
   java miniProject
   ```

> 💡 Bisa juga dibuka lewat IDE seperti IntelliJ IDEA, NetBeans, Eclipse, atau VS Code. Buka file `miniProject.java`, lalu jalankan method `main`.

---

## 📸 Contoh Tampilan Output

```bash
=== PROGRAM INPUT DATA MAHASISWA ===

Masukkan data untuk mahasiswa ke-1:
Nama : Arinal Haq
NIM  : 250810701100073
Nilai: 100

Masukkan data untuk mahasiswa ke-2:
Nama : Armin Arlert
NIM  : 250810701100073
NIM sudah terdaftar! Masukkan NIM yang berbeda.
NIM  : 250810701100999
Nilai: 105
Nilai tidak valid! Masukkan nilai antara 0 sampai 100.
Nilai: 55

Masukkan data untuk mahasiswa ke-3:
Nama : Vinsmoke Sanji
NIM  : 250810701100666
Nilai: 33
...

=== HASIL REKAPITULASI KELULUSAN MAHASISWA ===
Mahasiswa ke-1:
Nama  : Arinal Haq
NIM   : 250810701100073
Nilai : 100.0
Status: Lulus
-----------------------------
...
```
