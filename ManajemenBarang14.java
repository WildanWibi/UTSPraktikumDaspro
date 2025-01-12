import java.util.Scanner;

public class ManajemenBarang14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahStok;
        double hargaUnit, totalStok;
        System.out.println("Manajemen Stok Barang");
        
        while (true) {
            System.out.println("Ketik 'Selesai' Untuk Mengakhiri");
            System.out.print("Nama barang: ");
            String namaBarang = scanner.nextLine();
            
            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }
            
            System.out.print("Masukkan jumlah stok " + namaBarang + ": ");
            jumlahStok = scanner.nextInt();
            
            System.out.print("Masukkan harga per unit " + namaBarang + ": ");
            hargaUnit = scanner.nextDouble();
            
            totalStok = jumlahStok * hargaUnit;
            scanner.nextLine();
            
            System.out.println("\nInformasi Barang:");
            System.out.println("Nama Barang: " + namaBarang);
            System.out.println("Stok Tersedia: " + jumlahStok);
            System.out.println("Harga Per Unit: Rp " + hargaUnit);
            System.out.println("Total Nilai Stok: Rp " +  totalStok);
            
            System.out.print("\nMasukkan jumlah permintaan " + namaBarang + ": ");
            int jumlahPermintaan = scanner.nextInt();    
            scanner.nextLine();
       
            if (jumlahPermintaan <= jumlahStok) {
                int stokSetelahPermintaan = jumlahStok - jumlahPermintaan;
                double totalNilaiSetelahPermintaan = stokSetelahPermintaan * hargaUnit;
                
                System.out.println("\nHasil Permintaan: Permintaan dapat dipenuhi");
                System.out.println("Jumlah yang diminta: " + jumlahPermintaan);
                System.out.println("Sisa stok: " + stokSetelahPermintaan);
                System.out.println("Total sisa stok: Rp " + totalNilaiSetelahPermintaan);
            } else {
                System.out.println("\nHasil Permintaan: Stok tidak cukup");
                System.out.println("Jumlah yang diminta: " + jumlahPermintaan);
                System.out.println("Stok: " + jumlahStok);
                System.out.println("Kekurangan stok: " + (jumlahPermintaan - jumlahStok));
            }
            System.out.println("--------------------------------------------");
        }
        
        System.out.println("Program selesai");
    }
}
