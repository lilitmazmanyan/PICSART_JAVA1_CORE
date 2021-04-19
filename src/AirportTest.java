import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Plane p = new Plane();

        System.out.println("Please enter plane model");
        p.setModel(s.next());
        System.out.println("Please enter plane country");
        p.setCountry(s.next());
        System.out.println("Please enter plane year");
        p.setYear(s.nextInt());
        System.out.println("Please enter plane hours");
        p.setHours(s.nextShort());
        System.out.println("Please enter plane is military(f/t)");
        p.setMilitary(s.next());
        System.out.println("Please enter plane weight");
        p.setWeight(s.nextInt());
        System.out.println("Please enter plane top speed");
        p.setTopSpeed((short) s.nextInt());
        System.out.println("Please enter plane seats");
        p.setSeats(s.nextInt());
        System.out.println("Please enter plane cost");
        p.setCost(s.nextFloat());

        p.printInfo();
    }
}
