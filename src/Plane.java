public class Plane {
    private String model; // - name of the plane (Any not empty string)
    private String country; // - country the plane belongs to (Any not empty string)
    private int year; // - year of publishing  (from 1903 to 2020)
    private short hours; // - hours in air (from 0 to 10000)
    private boolean military; //  - is military or not
    private int weight; // - weight of plane (from 1000 KG to 160000 KG)
    private short topSpeed; // - maximal speed per hour (1000 km/h) (any not negative value)
    private int seats; // - number of seats (any not negative value)
    private double cost; // - cost of the plane (ex: 445.6$) (any not negative value)

    public void setModel(String model) {
        if (model != null && model.length() > 0) {
            this.model = model;
        }
    }

    public void setCountry(String country) {
        if (country != null && country.length() > 0) {
            this.country = country;
        }
    }

    public void setYear(int year) {
        if (year >= 1903 && year < 2020) {
            this.year = year;
        }
    }

    public void setHours(short hours) {
        if (hours > 0 && hours < 10000) {
            this.hours = hours;
        }
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public void setWeight(int weight) {
        if (weight > 1000 && weight < 160000) {
            this.weight = weight;
        }
    }

    public void setTopSpeed(short topSpeed) {
        if (topSpeed < 1000 && topSpeed >= 0) {
            this.topSpeed = topSpeed;
        }
    }

    public void setSeats(int seats) {
        if (seats >= 0) {
            this.seats = seats;
        }
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }
    }

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public int getHours() {
        return hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public int getWeight() {
        return weight;
    }

    public short getTopSpeed() {
        return topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public double getCost() {
        return cost;
    }

    public void printInfo() {
        System.out.printf("Model is: %s,\n" +
                        "Country is: %s,\n" +
                        "Year is: %d\n",
                this.getModel(), this.getCountry(), this.getYear());
    }
}
