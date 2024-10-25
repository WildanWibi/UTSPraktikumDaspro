import java.util.Scanner;

public class ManajemenSiswa14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int JumlahSiswa = 0, DiAtasRataRata = 0, DiBawahRataRata = 0;
        double NilaiTotal = 0;

        while (true) {
            System.out.println("Ketik 'Selesai' Untuk Berhenti");
            System.out.print("Nama Siswa: ");
            String NamaSiswa = sc.nextLine();

            if (NamaSiswa.equalsIgnoreCase("Selesai")) {
                break;
            }

            System.out.print("Masukkan Nilai "+ NamaSiswa + ": ");
            double Nilai = sc.nextDouble();
            System.out.println("-------------------------------------");
            sc.nextLine();

            NilaiTotal += Nilai;
            JumlahSiswa++;

            double ratasementara = NilaiTotal / JumlahSiswa;

            if (Nilai > ratasementara) {
                DiAtasRataRata++;
            } else {
                DiBawahRataRata++;
            }
        }
        if (JumlahSiswa > 0) {
            double RataRata = NilaiTotal / JumlahSiswa;
            System.out.println("-------------------------------------");
            System.out.println("Rata-rata nilai kelas: " + RataRata);
            System.out.println("Siswa di atas rata-rata: " + DiAtasRataRata);
            System.out.println("Siswa di bawah rata-rata: " + DiBawahRataRata);
            System.out.println("-------------------------------------");

         if (DiAtasRataRata > JumlahSiswa / 2) {
                System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
            } else {
                System.out.println("Mayoritas siswa memiliki nilai di bawah rata-rata.");
            }
        } else {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
        }
     }
  }
