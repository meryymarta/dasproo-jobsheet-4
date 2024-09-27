import java.util.Scanner; 
public class PemilihanBilangan12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel
        int angka;
        
        System.out.print("Masukkan sebuah angka: ");
        angka = sc.nextInt();

        if (angka % 2 == 0) 
        //genap
        System.out.println("Angka " + angka + " termasuk bilangan genap");
        else 
        //ganjil
        System.out.println("Angka " + angka + " termasuk bilangan ganjil");
    }
}
    