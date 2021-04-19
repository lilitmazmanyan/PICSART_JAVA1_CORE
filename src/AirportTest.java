import javax.print.attribute.standard.PrinterName;
import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
      /*  Scanner s = new Scanner(System.in);
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

        p.printInfo();*/
        Plane p1 = new Plane("SU-300", "Armenia", 2010, 200, true, 450, (short) 200, 150, 150);
        Plane p2 = new Plane("MK-190", "USA", 1990, 30, false, 130, (short) 160, 300, 160);
        Plane p3 = new Plane("LM-228", "Armenia", 2000, 60, false, 370, (short) 180, 250, 190);

        Plane[] planes = {p1, p2, p3};

        PlaneService.Task1(p1);
        PlaneService.getNewerPlane(p2, p3);
        PlaneService.getSmallestPlanesCountry(p1, p2, p3);
        PlaneService.printNonMilitaryPlanes(planes);
        PlaneService.printNonMilitaryPlanesWithMoreThan100HoursFlight(planes);
        PlaneService.getLightestPlane(planes);
        PlaneService.getTheOneWithAMinimalCost(planes);
        PlaneService.printPlanesByYearAsc(planes);
    }
}
