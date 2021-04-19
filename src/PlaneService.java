public class PlaneService {
    /*
    Task 1. (score 5)
        Create function:
        Parameter one Plane
        Result: print cost and topSpeed if the plane is military otherwise print model and country
    */
    void Task1(Plane plane) {
        System.out.println(plane.isMilitary() ?
                ("Cost is " + plane.getCost() + ", and topSpeed is " + plane.getTopSpeed())
                : ("Model is " + plane.getModel() + ", and country is " + plane.getCountry()));
    }

    /*
    Task 2. (score 5)
        Create function:
        Parameter two Planes
        Result: return the plane which one is newer (if they have the same age return first one).
     */
    Plane getNewerPlane(Plane p1, Plane p2) {
        return p1.getYear() <= p2.getYear() ? p1 : p2;
    }

    /*
    Task 3. (score 8)
        Create function:
        Parameter three Planes
        Result: print country of the plane with smallest seats count (if they have the same - print first).
    */
    void getSmallestPlanesCountry(Plane p1, Plane p2, Plane p3) {
        if (p1.getSeats() < p2.getSeats()) {
            if (p1.getSeats() < p3.getSeats()) {
                System.out.println(p1.getCountry());
            } else System.out.println(p3.getCountry());
        } else if (p1.getSeats() < p3.getSeats()) {

        }
    }


    /*
    Task 4. (score 8)
        Create function:
        Parameter array of Planes
        Result: print all not military planes.
     */
    void printNonMilitaryPlanes(Plane[] planes) {
        for (Plane p : planes) {
            if (p.isMilitary()) {
                p.printInfo();
            }
            ;
        }
    }

    /*
    Task 5. (score 9)
        Create function:
        Parameter array of Planes
        Result: print all military planes which were in air more than 100 hours.
     */
    void printNonMilitaryPlanesWithMoreThan100HoursFlight(Plane[] planes) {
        for (Plane p : planes) {
            if (p.isMilitary() && p.getHours() > 100) {
                p.printInfo();
            }
            ;
        }
    }

    /*
    Task 6. (score 10)
        Create function:
        Parameter array of Planes
        Result: return the plane with minimal weight (if there are some of them return last one).
     */
    Plane getLightestPlane(Plane[] planes) {
        Plane lightest = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (lightest.getWeight() > planes[i].getWeight()) {
                lightest = planes[i];
            }
        }
        return lightest;
    }

    /*
    Task 7. (score 10)
        Create function:
        Parameter array of Planes
        Result: return the plane with minimal cost from all military planes (if there are some of them return first one).
     */
    Plane getTheOneWithAMinimalCost(Plane[] planes) {
        Plane p = planes[planes.length - 1];
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getCost() < p.getCost()) {
                p = plane;
            }
        }
        return p.isMilitary() ? p : null;
    }

    /*
    Task 8. (score 15)
        Create function:
        Parameter array of Planes
        Result: print planes in ascending form order by year
     */
    void printPlanesByYearAsc(Plane[] planes) {
        for (int i = 0; i < planes.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[j].getYear() < planes[indexOfMin].getYear()) {
                    indexOfMin = j;
                }
            }
            Plane temp = planes[indexOfMin];
            planes[indexOfMin] = planes[i];
            planes[i] = temp;
        }
    }


}
