import java.util.Scanner;
public class PemilihanHari12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Deklarasi variabel
        String dayName, dayType;

        //proses
        System.out.print("Input day name: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday" :
            case "tuesday" :
            case "wednesday" :
            case "thursday" :
            case "friday" :
                dayType = "weekday";
                break;
            case "saturday" :
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }
            System.out.println(dayName + " is a " + dayType);

    }
    
}
