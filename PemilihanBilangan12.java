import java.util.Scanner; 
public class PemilihanBilangan12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel
        int angka;
        
        System.out.print("Masukkan sebuah angka: ");
        angka = sc.nextInt();

        //ternary operator
        String hasil;
        hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        System.out.println(hasil);
        
    }
}
    