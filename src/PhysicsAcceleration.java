import java.util.Scanner;

public class PhysicsAcceleration {
    public static void main(String[] args) {
        double Svelocity_m_s;
        double Evelocity_m_s;
        double time_s;
        double a;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the v0: ");
        Svelocity_m_s = userInput.nextDouble();

        System.out.println("Enter the v1: ");
        Evelocity_m_s = userInput.nextDouble();

        System.out.println("Enter the t: ");
        time_s = userInput.nextDouble();

        a = (Svelocity_m_s - Evelocity_m_s) / time_s;

        System.out.println("The Average acceleration is: " + a);


    }
}
