import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    double nilai;

    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
    }

    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
        System.out.println("-----------------------------");
    }
}

public class miniProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMahasiswa = 3;
        Mahasiswa[] daftarMhs = new Mahasiswa[jumlahMahasiswa];

        System.out.println("=== PROGRAM INPUT DATA MAHASISWA ===");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data untuk mahasiswa ke-" + (i + 1) + ":");
            daftarMhs[i] = new Mahasiswa();

            System.out.print("Nama : ");
            daftarMhs[i].nama = input.nextLine();

            String tempNim;
            while (true) {
                System.out.print("NIM  : ");
                tempNim = input.nextLine();
                
                boolean sudahAda = false;
                for (int j = 0; j < i; j++) {
                    if (daftarMhs[j].nim.equals(tempNim)) {
                        sudahAda = true;
                        break;
                    }
                }

                if (sudahAda) {
                    System.out.println("NIM sudah terdaftar! Masukkan NIM yang berbeda.");
                } else {
                    daftarMhs[i].nim = tempNim;
                    break;
                }
            }

            while (true) {
                System.out.print("Nilai: ");
                double tempNilai = Double.parseDouble(input.nextLine());
                if (tempNilai >= 0 && tempNilai <= 100) {
                    daftarMhs[i].nilai = tempNilai;
                    break;
                } else {
                    System.out.println("Nilai tidak valid! Masukkan nilai antara 0 sampai 100.");
                }
            }
        }

        System.out.println("\n=== HASIL REKAPITULASI KELULUSAN MAHASISWA ===");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ":");
            daftarMhs[i].tampilkanData();
            daftarMhs[i].cekKelulusan();
        }

        input.close();
    }
}