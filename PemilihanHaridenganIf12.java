import java.util.Scanner;
public class PemilihanHaridenganIf12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Deklarasi variabel
        int number;

        System.out.print("Masukkan nomor (1-7): ");
        number = input.nextInt();

        if (number >= 1 && number <= 7) {
            if (number <= 5) {
                System.out.println("weekday");
            } else {
                System.out.println("weekend");
            }
            } else {
                System.out.println("invalid number");

            }}
        


        
    }
    

