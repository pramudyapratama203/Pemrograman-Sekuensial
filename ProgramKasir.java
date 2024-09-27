import java.util.Scanner;
import java.text.DecimalFormat;

public class programkasir {

    public static void main(String[] args) {
        
        // Deklarasi variabel
        double diskon, hargaSetelahDiskon;
        int pilihan, uangTerima, uangKembalian, totalHargaBeras = 0;

        // Membuat objek input
        Scanner sc = new Scanner(System.in);

        // Membuat objek Desimal format
        DecimalFormat df = new DecimalFormat("###,###.00");

        // Tampilan menu
        System.out.println("--- Program Kasir Warung Beras ---");
        System.out.println("Daftar Menu Beras Makmur Jaya Aman Sentosa");
        System.out.println("1. Beras 1 kg");
        System.out.println("2. Beras 2 kg");
        System.out.println("3. Beras 3 kg");
        
        System.out.print("Silahkan pilih jumlah beras yang diinginkan (1/2/3): "); pilihan=sc.nextInt();

        // Harga per kg beras
        int hargaBeras = 26320;
        
        // Proses perhitungan harga berdasarkan pilihan 
        switch (pilihan) {
            case 1:
                totalHargaBeras = hargaBeras;
                System.out.println("Anda memilih beras 1 kg");
                break;
            case 2:
                totalHargaBeras = hargaBeras * 2;
                System.out.println("Anda memilih beras 2 kg");
                break;
            case 3:
                totalHargaBeras = hargaBeras * 3;
                System.out.println("Anda memilih beras 3 kg");
                break;
            default:
                System.out.println("Maaf, pilihan anda tidak ada");
                return;
        }

        // Menghitung diskon (5%)
        diskon = totalHargaBeras * 0.05;

        // Menghitung total harga setelah diskon
        hargaSetelahDiskon = totalHargaBeras - diskon;
        System.out.println("\n--- Rincian Belanja ---");
        System.out.println("Harga total sebelum diskon adalah: " + df.format(totalHargaBeras));
        System.out.println("Karena ada diskon 5%, total harga setelah diskon adalah: " + df.format(hargaSetelahDiskon));

        // Masukkan uang yang diterima dari pembeli
        System.out.print("Masukkan uang dari pembeli: "); uangTerima=sc.nextInt();
       

        // Menghitung uang kembalian
        uangKembalian = uangTerima - (int) hargaSetelahDiskon;
        System.out.println("\n--- Pembayaran ---");
        System.out.println("Uang kembalian yang didapat adalah: " + df.format(uangKembalian));

        System.out.println("\nTerima kasih sudah berbelanja");

    }
}

/* PUTU PRAMUDYA PRATAMA
 * 24082010113
 * 1C
 */
