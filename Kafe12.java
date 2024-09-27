import java.util.Scanner;
public class Kafe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        //proses
        System.out.print("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi" :
                hargaMenu = 12000;
                break;
            case "teh" :
                hargaMenu = 7000;
                break;
            case "coklat" :
                hargaMenu = 20000;
                break;
        }
        //menghitung total harga
        double totalHarga = hargaMenu * jumlah;

        //memilih ukuran cup
        switch (ukuranCup) {
            case 'S':
                break;
            case 'M' :
                totalHarga += 0.25 * totalHarga;
            case 'L' :
                totalHarga += 0.4 * totalHarga;
                break;
            default:
            System.out.println("Ukuran cup " + ukuranCup + " tidak tersedia");
            return; // ukuran cup tidak valid
        }
        //menghitung jumlah pembayaran
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.err.println("Nominal bayar: " + nominalBayar);
    }
    
}
