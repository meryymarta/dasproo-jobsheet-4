import java.util.Scanner;
public class WeaponSelection12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declaration variables
        float distanceEnemy;
        
        System.out.print("Enter the enemy distance: ");
        distanceEnemy = input.nextFloat();

        //Condition to selection the weapon
        if (distanceEnemy <= 5 ) {
            System.out.println( "Use the melee weapon");
        } else if (distanceEnemy <= 1000) {
            System.out.println("Use ranged weapon");
        } else {
            System.out.println("The enemy is too far away, it cannot be attacked");
        
        }
        
    }
    
}
